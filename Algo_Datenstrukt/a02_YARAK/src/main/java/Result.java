


public class Result 
{

public Stopwatch searchWatch;
public Stopwatch insertWatch;
public Stopwatch removeWatch;
 

Result(Stopwatch searchWatch, Stopwatch insertWatch, Stopwatch removeWatch)
{
    
     this.searchWatch=searchWatch;
   this.insertWatch=insertWatch;
   this.removeWatch=removeWatch;
}

public void setSearchTime(Stopwatch searchWat)
{
this.searchWatch=searchWat;
}

public void setInsertTime(Stopwatch insertWat)
{
this.insertWatch=insertWat;
}

public void setRemoveTime(Stopwatch removeWat)
{
this.removeWatch=removeWat;
}



public Stopwatch getSearchTime()
{
return searchWatch;
}

public Stopwatch getInsertTime()
{
return insertWatch;
}

public Stopwatch getRemoveTime()
{
return removeWatch;
}

    
} 
