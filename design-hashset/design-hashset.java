class MyHashSet {
    List <Integer> setKeys;
    

    public MyHashSet() {
        
     setKeys=new ArrayList<Integer>();
        
        
    }
    
    public void add(int key)
    {
        if(setKeys.size()==0){
            setKeys.add(key);
        }
     else{
            if(contains(key)==false){
                setKeys.add(key);
             }
            
    }   
        
    }
    
    public void remove(int key) {
        for(int i=0;i<setKeys.size(); ++i){
            if (key==setKeys.get(i))
            {
               setKeys.remove(i);
            }
            }
        
    }

    
    public boolean contains(int key) {
        for(int i=0;i<setKeys.size(); ++i)
        { 
            if (key==setKeys.get(i)){
                return true;
            }
        }
        return false;

    }
}
            

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */