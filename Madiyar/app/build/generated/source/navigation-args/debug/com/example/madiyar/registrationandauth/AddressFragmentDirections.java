package com.example.madiyar.registrationandauth;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class AddressFragmentDirections {
  @NonNull
  public static ActionAddressFragmentToFinalRegistrationFragment actionAddressFragmentToFinalRegistrationFragment(
      ) {
    return new ActionAddressFragmentToFinalRegistrationFragment();
  }

  public static class ActionAddressFragmentToFinalRegistrationFragment implements NavDirections {
    public ActionAddressFragmentToFinalRegistrationFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_addressFragment_to_finalRegistrationFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAddressFragmentToFinalRegistrationFragment that = (ActionAddressFragmentToFinalRegistrationFragment) object;
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
      return "ActionAddressFragmentToFinalRegistrationFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
