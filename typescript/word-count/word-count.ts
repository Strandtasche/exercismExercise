class Words {
    constructor() {}

    count(inp: string): Map<string, number> {
        var wordCount = new Map<string, number>();
        inp.trim().toLowerCase().split(/\s/).filter(x => x.length != 0)
            .forEach(word => wordCount.set(word, ((wordCount.get(word) || 0) + 1) || 1)) // wordCount.get(word) + 1))
        return wordCount
    }
}

export default Words