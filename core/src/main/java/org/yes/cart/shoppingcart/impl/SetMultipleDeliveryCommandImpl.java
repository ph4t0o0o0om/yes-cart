package org.yes.cart.shoppingcart.impl;

import org.springframework.context.ApplicationContext;
import org.yes.cart.shoppingcart.ShoppingCart;
import org.yes.cart.shoppingcart.ShoppingCartCommand;

import java.util.Map;

/**
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 14:12:54
 */
public class SetMultipleDeliveryCommandImpl  extends AbstractCartCommandImpl  implements ShoppingCartCommand {

    private static final long serialVersionUID = 20110118L;

    public static String CMD_KEY = "setMultipleDeliveryCmd";

    private final boolean value;

    /**
     * Execute command on shopping cart to perform changes.
     *
     * @param shoppingCart the shopping cart
     */
    public void execute(final ShoppingCart shoppingCart) {
        shoppingCart.getOrderInfo().setMultipleDelivery(value);
        setModifiedDate(shoppingCart);
    }

    /**
     * @return command key
     */
    public String getCmdKey() {
        return CMD_KEY;
    }

    /**
     *
     * @param applicationContext application context
     * @param parameters page parameters
     */
    public SetMultipleDeliveryCommandImpl(
            final ApplicationContext applicationContext, final Map parameters) {
        super();
        value = Boolean.valueOf((String) parameters.get(CMD_KEY));
    }


}
