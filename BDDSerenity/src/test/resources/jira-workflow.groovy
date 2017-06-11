when 'To Do', {
    'success' should: 'In Progress'
}

when 'In Progress', {
    'success' should: ['Done']
}

when 'In Progress', {
    'failure' should: ['In Progress']
}