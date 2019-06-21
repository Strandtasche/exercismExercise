class Gigasecond {

    originDate: Date;
    constructor(originDate: Date) {
        this.originDate = originDate;
    }

    date() {
        return new Date(this.originDate.getTime() + 10**9 * 1000);
    }
}

export default Gigasecond