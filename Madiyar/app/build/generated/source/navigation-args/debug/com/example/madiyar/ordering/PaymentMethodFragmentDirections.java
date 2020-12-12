package com.example.madiyar.ordering;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class PaymentMethodFragmentDirections {
  @NonNull
  public static ActionPaymentMethodFragmentToConfirmationFragment actionPaymentMethodFragmentToConfirmationFragment(
      ) {
    return new ActionPaymentMethodFragmentToConfirmationFragment();
  }

  public static class ActionPaymentMethodFragmentToConfirmationFragment implements NavDirections {
    public ActionPaymentMethodFragmentToConfirmationFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_paymentMethodFragment_to_confirmationFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionPaymentMethodFragmentToConfirmationFragment that = (ActionPaymentMethodFragmentToConfirmationFragment) object;
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
      return "ActionPaymentMethodFragmentToConfirmationFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
