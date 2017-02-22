public List<Integer> getDivisors()
        {
        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = 2; i <= this.maxCells; i++)
        {
        if ((this.maxCells % i) == 0)
        {
        divisors.add(i);
        }
        }

        return divisors;
        }