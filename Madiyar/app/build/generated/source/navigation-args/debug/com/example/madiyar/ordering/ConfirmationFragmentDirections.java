package com.example.madiyar.ordering;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ConfirmationFragmentDirections {
  @NonNull
  public static ActionConfirmationFragmentToUserMainPageFragment2 actionConfirmationFragmentToUserMainPageFragment2(
      ) {
    return new ActionConfirmationFragmentToUserMainPageFragment2();
  }

  public static class ActionConfirmationFragmentToUserMainPageFragment2 implements NavDirections {
    public ActionConfirmationFragmentToUserMainPageFragment2() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_confirmationFragment_to_userMainPageFragment2;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionConfirmationFragmentToUserMainPageFragment2 that = (ActionConfirmationFragmentToUserMainPageFragment2) object;
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
      return "ActionConfirmationFragmentToUserMainPageFragment2(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
