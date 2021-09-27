class VariableArgumentClass
{
   void variableArgumentMethod(int ...a)
   {
       for(int p : a) {
           System.out.print(p + " ");
       }
           System.out.println();
   }
}
public class VariableArgument {
    public static void main(String[] args) {
        VariableArgumentClass vac = new VariableArgumentClass();
        vac.variableArgumentMethod(1);
        vac.variableArgumentMethod(1,2,3);
        vac.variableArgumentMethod(1,2,88,5,34,12,33);
        vac.variableArgumentMethod();
    }
}
