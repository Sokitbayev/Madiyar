package com.example.madiyar.registrationandauth;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class StartFragmentDirections {
  @NonNull
  public static ActionStartFragmentToEntranceFragment actionStartFragmentToEntranceFragment() {
    return new ActionStartFragmentToEntranceFragment();
  }

  @NonNull
  public static ActionStartFragmentToCityFragment actionStartFragmentToCityFragment() {
    return new ActionStartFragmentToCityFragment();
  }

  public static class ActionStartFragmentToEntranceFragment implements NavDirections {
    public ActionStartFragmentToEntranceFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_startFragment_to_entranceFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStartFragmentToEntranceFragment that = (ActionStartFragmentToEntranceFragment) object;
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
      return "ActionStartFragmentToEntranceFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionStartFragmentToCityFragment implements NavDirections {
    public ActionStartFragmentToCityFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_startFragment_to_cityFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStartFragmentToCityFragment that = (ActionStartFragmentToCityFragment) object;
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
      return "ActionStartFragmentToCityFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
