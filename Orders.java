import java.text.DecimalFormat;
public class Orders
 {
5
public static double productCost(int qty, char productType)
 {
 final double WIDGET_COST = 0.25;
 final double GIZMO_COST = 0.75;
 double cost = 0;

 if (productType == 'W')
 cost = qty * WIDGET_COST;
 else
 cost = qty * GIZMO_COST;

 return cost;

 }//end of method productCost

 public static double shippingCost(int qty, char productType, char deliveryType)
 {
 final double FREDCOST = 25;
 final double USPSCOST = 1.25;
 final int WIDGETS_PER_POUND = 12;
 final int GIZMOS_PER_POUND = 16;
 double shipCost = 0.0;

 if (deliveryType == 'F')
 return FREDCOST;
 else if(productType == 'W')
 shipCost = (qty/WIDGETS_PER_POUND) * USPSCOST;
 else
 shipCost = (Math.ceil((double) qty / GIZMOS_PER_POUND)) * USPSCOST;
 return shipCost;

 }//end of method shippingCost

 public static double totalCost(double productCost, double shippingCost)
 {
 return(productCost + shippingCost);

 }// end of method totalCost
 }//end of orders class
