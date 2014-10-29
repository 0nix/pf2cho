public class StackReferenceBased implements StackInterface
{
  private Node top;

  public StackReferenceBased()
  {
    top = null;
  }  // end default constructor

  public boolean isEmpty()
  {
    return top == null;
  }  // end isEmpty

  public void push(Object newItem)
  {
    top = new Node(newItem, top);
  }  // end push

  public Object pop() throws StackException
  {
    if (!isEmpty()) {
      Object obj = top.getItem();
      top = top.getNext();
      return obj;
    } else throw new StackException("StackException on " + "pop: stack empty");
  }  // end pop

  public void popAll()
  {
    top = null;
  }  // end popAll

  public Object peek() throws StackException
  {
    if (!isEmpty()) return top.getItem(); 
    else throw new StackException("StackException on " + "peek: stack empty");
  }  // end peek

}  // end StackReferenceBased
