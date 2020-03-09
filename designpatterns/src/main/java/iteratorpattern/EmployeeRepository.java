package iteratorpattern;

public class EmployeeRepository implements Sector{
	public String[] employees = {"John", "Maria", "Daniel", "Justin", "Mark"};

    public Iterator getIterator() {
        return new EmployeeIterator();
    }
    
    private class EmployeeIterator implements Iterator {
        int index;
        
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            } 
            return false;
        }


        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}
