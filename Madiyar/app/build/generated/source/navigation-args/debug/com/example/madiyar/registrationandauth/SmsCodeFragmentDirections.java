package com.example.madiyar.registrationandauth;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SmsCodeFragmentDirections {
  @NonNull
  public static ActionSmsCodeFragmentToNewPasswordFragment actionSmsCodeFragmentToNewPasswordFragment(
      ) {
    return new ActionSmsCodeFragmentToNewPasswordFragment();
  }

  public static class ActionSmsCodeFragmentToNewPasswordFragment implements NavDirections {
    public ActionSmsCodeFragmentToNewPasswordFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_smsCodeFragment_to_newPasswordFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSmsCodeFragmentToNewPasswordFragment that = (ActionSmsCodeFragmentToNewPasswordFragment) object;
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
      return "ActionSmsCodeFragmentToNewPasswordFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
