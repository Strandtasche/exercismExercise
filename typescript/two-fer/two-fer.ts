class TwoFer {
  static twoFer(...args: string[]) {
    if (args.length == 0) {
      return 'One for you, one for me.'
    }
    else if (args.length == 1) {
      return `One for ${args[0]}, one for me.`
    }
    else {
      console.log('too many arguments')
      throw new Error('to many arguments')
    }
  }
}

export default TwoFer
