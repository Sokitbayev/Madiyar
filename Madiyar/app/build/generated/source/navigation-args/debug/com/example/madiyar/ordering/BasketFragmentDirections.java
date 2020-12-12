package com.example.madiyar.ordering;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class BasketFragmentDirections {
  @NonNull
  public static ActionBasketFragmentToPaymentMethodFragment actionBasketFragmentToPaymentMethodFragment(
      ) {
    return new ActionBasketFragmentToPaymentMethodFragment();
  }

  public static class ActionBasketFragmentToPaymentMethodFragment implements NavDirections {
    public ActionBasketFragmentToPaymentMethodFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_basketFragment_to_paymentMethodFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBasketFragmentToPaymentMethodFragment that = (ActionBasketFragmentToPaymentMethodFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBasketFragmentToPaymentMethodFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
