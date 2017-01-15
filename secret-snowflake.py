from random import shuffle

class SecretSnowflake:
    def __init__(self,fname):
        #read from file
        with open(fname) as f:
            rd = f.readlines()

        #make list from file
        self.names = []
        for line in rd:
            self.names.append(line[:-1].split())

        #shuffle names
        shuff = [None] * len(self.names)
        for i in range(len(self.names)):
            shuff[i] = [i,i]
        shuffle(shuff)
        for i in range(len(self.names)-1,-1,-1):
            if i == 0:
                shuff[i][1] = shuff[len(shuff)-1][1]
            else:
                shuff[i][1] = shuff[i-1][1]
        #make retrieval of names easier
        self.buyfor = [None] * len(self.names)
        for s in shuff:
            self.buyfor[s[0]] = s[1]

    def retrieveName(self,id):
        print("You are buying for", self.names[self.buyfor[id]][0])

    def runTest(self):
        print("Find your number in the list")
        for i in range(len(self.names)):
            print(self.names[i][0], i)
        id = input('Please enter your number: ')
        self.retrieveName(int(id))

SecretSnowflake('names.txt').runTest()
