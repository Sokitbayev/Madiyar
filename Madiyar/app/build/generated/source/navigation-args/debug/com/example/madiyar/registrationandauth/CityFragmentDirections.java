package com.example.madiyar.registrationandauth;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CityFragmentDirections {
  @NonNull
  public static ActionCityFragmentToAddressFragment actionCityFragmentToAddressFragment() {
    return new ActionCityFragmentToAddressFragment();
  }

  public static class ActionCityFragmentToAddressFragment implements NavDirections {
    public ActionCityFragmentToAddressFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_cityFragment_to_addressFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCityFragmentToAddressFragment that = (ActionCityFragmentToAddressFragment) object;
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
      return "ActionCityFragmentToAddressFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
