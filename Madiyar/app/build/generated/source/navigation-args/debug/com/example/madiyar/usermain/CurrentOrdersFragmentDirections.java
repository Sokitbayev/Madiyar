package com.example.madiyar.usermain;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CurrentOrdersFragmentDirections {
  @NonNull
  public static ActionCurrentOrdersFragmentToOneCurrentOrderFragment actionCurrentOrdersFragmentToOneCurrentOrderFragment(
      ) {
    return new ActionCurrentOrdersFragmentToOneCurrentOrderFragment();
  }

  public static class ActionCurrentOrdersFragmentToOneCurrentOrderFragment implements NavDirections {
    public ActionCurrentOrdersFragmentToOneCurrentOrderFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_currentOrdersFragment_to_oneCurrentOrderFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCurrentOrdersFragmentToOneCurrentOrderFragment that = (ActionCurrentOrdersFragmentToOneCurrentOrderFragment) object;
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
      return "ActionCurrentOrdersFragmentToOneCurrentOrderFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
