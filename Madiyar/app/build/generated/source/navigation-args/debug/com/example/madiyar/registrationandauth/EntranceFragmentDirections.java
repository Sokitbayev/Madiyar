package com.example.madiyar.registrationandauth;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class EntranceFragmentDirections {
  @NonNull
  public static ActionEntranceFragmentToForgotPasswordFragment actionEntranceFragmentToForgotPasswordFragment(
      ) {
    return new ActionEntranceFragmentToForgotPasswordFragment();
  }

  @NonNull
  public static ActionEntranceFragmentToUserMainPageFragment2 actionEntranceFragmentToUserMainPageFragment2(
      ) {
    return new ActionEntranceFragmentToUserMainPageFragment2();
  }

  public static class ActionEntranceFragmentToForgotPasswordFragment implements NavDirections {
    public ActionEntranceFragmentToForgotPasswordFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_entranceFragment_to_forgotPasswordFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionEntranceFragmentToForgotPasswordFragment that = (ActionEntranceFragmentToForgotPasswordFragment) object;
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
      return "ActionEntranceFragmentToForgotPasswordFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionEntranceFragmentToUserMainPageFragment2 implements NavDirections {
    public ActionEntranceFragmentToUserMainPageFragment2() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_entranceFragment_to_userMainPageFragment2;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionEntranceFragmentToUserMainPageFragment2 that = (ActionEntranceFragmentToUserMainPageFragment2) object;
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
      return "ActionEntranceFragmentToUserMainPageFragment2(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
