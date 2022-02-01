package Immutable_Mutable;

public final  class ImmutableClass
{
        private final int first;
        private final int second;
        // Constructor
        public ImmutableClass(int first,int second){
            this.first=first;
            this.second=second;
        }
        public int getFirst(){
            return this.first;
        }
        public int getSecond(){
            return this.second;
        }
//    public void setFirst(int second){
//        this.second =second;
//    }
}
