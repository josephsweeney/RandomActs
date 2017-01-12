from random import shuffle
#read from file
with open("names.txt") as f:
  rd = f.readlines()

#make list from file
names = []
for line in rd:
  names.append(line[:-1].split())

#shuffle names
shuff = [None] * len(names)
for i in range(len(names)):
    shuff[i] = [i,i]
shuffle(shuff)
for i in range(len(names)-1,-1,-1):
    if i == 0:
        shuff[i][1] = shuff[len(shuff)-1][1]
    else:
        shuff[i][1] = shuff[i-1][1]

#make retrieval of names easier
buyfor = [None] * len(names)
for s in shuff:
     buyfor[s[0]] = s[1]

def retrieveName(id):
    print("You are buying for", names[buyfor[id]][0])
