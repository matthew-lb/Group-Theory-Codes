# Group-Theory-Codes

## What this is

This is a repository containing codes (and possibly in the future articles) written by me which pertain to Group Theory / Abstract Algebra which I find useful. It was initially inspired by my Abstract Algebra Homeworks and Midterm where I had to spend a lot of time evaluating products of elements in the n-th Symmetric Group. 

## What it currently contains

### Symmetric Group Functions

1. SymGroupElem.java - Object which represents an element of the n-th Symmetric Group. 

2. CycElem - Object which represents an individual cycle element of the n-th Symmetric Group (e.g. (1345)).

3. Driver - Random code where functions are tested.

4. SymDriver - Code which allows the user to multiply different cycles to see what the resulting element of the n-th Symmetric group is. Just time the cycles in consecutively (e.g. "(12)(345)(124)") and it will output the result. Press "q" to quit. (N.B. Currently you can only enter cycles contained in the 9-th Symmetric group, so no using 10+ in your cyles. I'll probably change this at some point.)


## Future Plans?

I may write an article on the conjugate action when I have free time. I might also do something that has to do with the action of the n-th Symmetric group on a polynomial in n-variables or some other invariant-theory flavored thingy. I might also look through the Sage Library and see if I can find any features I would like to implement / modify.