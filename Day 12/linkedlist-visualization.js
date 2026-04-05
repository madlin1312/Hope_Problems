const listArea = document.getElementById('listArea');
const consoleOutput = document.getElementById('consoleOutput');
const statusBox = document.getElementById('statusBox');
const prevBtn = document.getElementById('prevBtn');
const playBtn = document.getElementById('playBtn');
const nextBtn = document.getElementById('nextBtn');
const autoLoop = document.getElementById('autoLoop');

const steps = [
    {
        title: 'Step 1: Initialize the linked list',
        nodes: [],
        log: ['Starting a new LinkedList<>()', 'Current list is empty []']
    },
    {
        title: 'Step 2: Add nodes A, B, C',
        nodes: ['A', 'B', 'C'],
        log: ['Adding A', 'Adding B', 'Adding C', 'Current list: [A, B, C]']
    },
    {
        title: 'Step 3: addFirst("startrace")',
        nodes: ['startrace', 'A', 'B', 'C'],
        log: ['Inserting startrace at the start', 'Current list: [startrace, A, B, C]']
    },
    {
        title: 'Step 4: Remove B from the list',
        nodes: ['startrace', 'A', 'C'],
        log: ['Removing B from the list', 'B is Disqualified', 'Current list: [startrace, A, C]']
    },
    {
        title: 'Step 5: Clear the list after race complete',
        nodes: [],
        log: ['Race is completed!!', 'Clearing the list', 'Current list: []']
    }
];

let currentStep = 0;
let playing = false;
let intervalId = null;

function renderList(nodes) {
    listArea.innerHTML = '';
    const row = document.createElement('div');
    row.className = 'node-row';

    if (nodes.length === 0) {
        const empty = document.createElement('div');
        empty.className = 'node';
        empty.textContent = 'Empty';
        empty.style.opacity = '0.55';
        row.appendChild(empty);
    } else {
        nodes.forEach((label) => {
            const node = document.createElement('div');
            node.className = 'node';
            node.textContent = label;
            row.appendChild(node);
        });
    }

    listArea.appendChild(row);
}

function addConsoleLines(lines) {
    consoleOutput.innerHTML = '';
    lines.forEach((text) => {
        const line = document.createElement('div');
        line.className = 'console-line';
        line.textContent = text;
        if (text.includes('Current list')) {
            line.classList.add('success');
        } else if (text.includes('Disqualified') || text.includes('Race is completed')) {
            line.classList.add('note');
        }
        consoleOutput.appendChild(line);
    });
    consoleOutput.scrollTop = consoleOutput.scrollHeight;
}

function updateStatus() {
    const step = steps[currentStep];
    statusBox.textContent = `${step.title} (${currentStep + 1} of ${steps.length})`;
}

function setStep(index) {
    if (index < 0 || index >= steps.length) return;
    currentStep = index;
    renderList(steps[currentStep].nodes);
    addConsoleLines(steps[currentStep].log);
    updateStatus();
}

function nextStep() {
    const nextIndex = currentStep + 1;
    if (nextIndex >= steps.length) {
        if (autoLoop.checked) {
            setStep(0);
        } else {
            stopPlayback();
        }
    } else {
        setStep(nextIndex);
    }
}

function prevStep() {
    const prevIndex = currentStep - 1;
    if (prevIndex >= 0) {
        setStep(prevIndex);
    }
}

function startPlayback() {
    if (playing) return;
    playing = true;
    playBtn.textContent = 'Pause';
    intervalId = setInterval(() => {
        if (currentStep >= steps.length - 1 && !autoLoop.checked) {
            stopPlayback();
            return;
        }
        nextStep();
    }, 2200);
}

function stopPlayback() {
    playing = false;
    playBtn.textContent = 'Play';
    clearInterval(intervalId);
}

playBtn.addEventListener('click', () => {
    if (playing) {
        stopPlayback();
    } else {
        startPlayback();
    }
});

nextBtn.addEventListener('click', () => {
    stopPlayback();
    nextStep();
});

prevBtn.addEventListener('click', () => {
    stopPlayback();
    prevStep();
});

autoLoop.addEventListener('change', () => {
    if (!playing) return;
    stopPlayback();
    startPlayback();
});

setStep(0);
