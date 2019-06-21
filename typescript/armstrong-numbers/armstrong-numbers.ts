class ArmstrongNumbers {
    constructor() {}

    static isArmstrongNumber(inp: number): Boolean {
        const sum = inp.toString().split("").map(x => Number(x)).map(x => x ** inp.toString().length).reduce((sum, current) => sum + current)
        return sum == inp
    }
}

export default ArmstrongNumbers