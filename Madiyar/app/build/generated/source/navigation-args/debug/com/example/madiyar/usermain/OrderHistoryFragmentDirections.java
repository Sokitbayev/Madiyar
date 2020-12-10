package com.example.madiyar.usermain;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderHistoryFragmentDirections {
  @NonNull
  public static ActionOrderHistoryFragmentToOrderHistoryDetailedFragment actionOrderHistoryFragmentToOrderHistoryDetailedFragment(
      ) {
    return new ActionOrderHistoryFragmentToOrderHistoryDetailedFragment();
  }

  public static class ActionOrderHistoryFragmentToOrderHistoryDetailedFragment implements NavDirections {
    public ActionOrderHistoryFragmentToOrderHistoryDetailedFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_orderHistoryFragment_to_orderHistoryDetailedFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionOrderHistoryFragmentToOrderHistoryDetailedFragment that = (ActionOrderHistoryFragmentToOrderHistoryDetailedFragment) object;
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
      return "ActionOrderHistoryFragmentToOrderHistoryDetailedFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
