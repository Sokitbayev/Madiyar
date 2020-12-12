package com.example.madiyar.usermain;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserMainPageFragmentDirections {
  @NonNull
  public static ActionUserMainPageFragment2ToOrderHistoryDetailedFragment actionUserMainPageFragment2ToOrderHistoryDetailedFragment(
      ) {
    return new ActionUserMainPageFragment2ToOrderHistoryDetailedFragment();
  }

  @NonNull
  public static ActionUserMainPageFragment2ToCurrentOrdersFragment actionUserMainPageFragment2ToCurrentOrdersFragment(
      ) {
    return new ActionUserMainPageFragment2ToCurrentOrdersFragment();
  }

  @NonNull
  public static ActionUserMainPageFragment2ToShopFragment actionUserMainPageFragment2ToShopFragment(
      ) {
    return new ActionUserMainPageFragment2ToShopFragment();
  }

  public static class ActionUserMainPageFragment2ToOrderHistoryDetailedFragment implements NavDirections {
    public ActionUserMainPageFragment2ToOrderHistoryDetailedFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_userMainPageFragment2_to_orderHistoryDetailedFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionUserMainPageFragment2ToOrderHistoryDetailedFragment that = (ActionUserMainPageFragment2ToOrderHistoryDetailedFragment) object;
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
      return "ActionUserMainPageFragment2ToOrderHistoryDetailedFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionUserMainPageFragment2ToCurrentOrdersFragment implements NavDirections {
    public ActionUserMainPageFragment2ToCurrentOrdersFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_userMainPageFragment2_to_currentOrdersFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionUserMainPageFragment2ToCurrentOrdersFragment that = (ActionUserMainPageFragment2ToCurrentOrdersFragment) object;
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
      return "ActionUserMainPageFragment2ToCurrentOrdersFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionUserMainPageFragment2ToShopFragment implements NavDirections {
    public ActionUserMainPageFragment2ToShopFragment() {
    }

    @Override
    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    @Override
    public int getActionId() {
      return com.example.madiyar.R.id.action_userMainPageFragment2_to_shopFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionUserMainPageFragment2ToShopFragment that = (ActionUserMainPageFragment2ToShopFragment) object;
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
      return "ActionUserMainPageFragment2ToShopFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
