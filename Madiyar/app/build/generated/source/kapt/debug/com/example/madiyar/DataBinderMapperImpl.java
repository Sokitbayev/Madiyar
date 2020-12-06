package com.example.madiyar;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.madiyar.databinding.ActivityMainBindingImpl;
import com.example.madiyar.databinding.FragmentAddressBindingImpl;
import com.example.madiyar.databinding.FragmentCityBindingImpl;
import com.example.madiyar.databinding.FragmentEntranceBindingImpl;
import com.example.madiyar.databinding.FragmentFavouriteBindingImpl;
import com.example.madiyar.databinding.FragmentFinalRegistrationBindingImpl;
import com.example.madiyar.databinding.FragmentForgotPasswordBindingImpl;
import com.example.madiyar.databinding.FragmentNewPasswordBindingImpl;
import com.example.madiyar.databinding.FragmentOrderHistoryBindingImpl;
import com.example.madiyar.databinding.FragmentProfileBindingImpl;
import com.example.madiyar.databinding.FragmentSmsCodeBindingImpl;
import com.example.madiyar.databinding.FragmentStartBindingImpl;
import com.example.madiyar.databinding.FragmentUserMainPageBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTADDRESS = 2;

  private static final int LAYOUT_FRAGMENTCITY = 3;

  private static final int LAYOUT_FRAGMENTENTRANCE = 4;

  private static final int LAYOUT_FRAGMENTFAVOURITE = 5;

  private static final int LAYOUT_FRAGMENTFINALREGISTRATION = 6;

  private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 7;

  private static final int LAYOUT_FRAGMENTNEWPASSWORD = 8;

  private static final int LAYOUT_FRAGMENTORDERHISTORY = 9;

  private static final int LAYOUT_FRAGMENTPROFILE = 10;

  private static final int LAYOUT_FRAGMENTSMSCODE = 11;

  private static final int LAYOUT_FRAGMENTSTART = 12;

  private static final int LAYOUT_FRAGMENTUSERMAINPAGE = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_address, LAYOUT_FRAGMENTADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_city, LAYOUT_FRAGMENTCITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_entrance, LAYOUT_FRAGMENTENTRANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_favourite, LAYOUT_FRAGMENTFAVOURITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_final_registration, LAYOUT_FRAGMENTFINALREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_forgot_password, LAYOUT_FRAGMENTFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_new_password, LAYOUT_FRAGMENTNEWPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_order_history, LAYOUT_FRAGMENTORDERHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_sms_code, LAYOUT_FRAGMENTSMSCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_start, LAYOUT_FRAGMENTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.madiyar.R.layout.fragment_user_main_page, LAYOUT_FRAGMENTUSERMAINPAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDRESS: {
          if ("layout/fragment_address_0".equals(tag)) {
            return new FragmentAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCITY: {
          if ("layout/fragment_city_0".equals(tag)) {
            return new FragmentCityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_city is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTENTRANCE: {
          if ("layout/fragment_entrance_0".equals(tag)) {
            return new FragmentEntranceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_entrance is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVOURITE: {
          if ("layout/fragment_favourite_0".equals(tag)) {
            return new FragmentFavouriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFINALREGISTRATION: {
          if ("layout/fragment_final_registration_0".equals(tag)) {
            return new FragmentFinalRegistrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_final_registration is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGOTPASSWORD: {
          if ("layout/fragment_forgot_password_0".equals(tag)) {
            return new FragmentForgotPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWPASSWORD: {
          if ("layout/fragment_new_password_0".equals(tag)) {
            return new FragmentNewPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERHISTORY: {
          if ("layout/fragment_order_history_0".equals(tag)) {
            return new FragmentOrderHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSMSCODE: {
          if ("layout/fragment_sms_code_0".equals(tag)) {
            return new FragmentSmsCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sms_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTART: {
          if ("layout/fragment_start_0".equals(tag)) {
            return new FragmentStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERMAINPAGE: {
          if ("layout/fragment_user_main_page_0".equals(tag)) {
            return new FragmentUserMainPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_main_page is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "titleFragment");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_main_0", com.example.madiyar.R.layout.activity_main);
      sKeys.put("layout/fragment_address_0", com.example.madiyar.R.layout.fragment_address);
      sKeys.put("layout/fragment_city_0", com.example.madiyar.R.layout.fragment_city);
      sKeys.put("layout/fragment_entrance_0", com.example.madiyar.R.layout.fragment_entrance);
      sKeys.put("layout/fragment_favourite_0", com.example.madiyar.R.layout.fragment_favourite);
      sKeys.put("layout/fragment_final_registration_0", com.example.madiyar.R.layout.fragment_final_registration);
      sKeys.put("layout/fragment_forgot_password_0", com.example.madiyar.R.layout.fragment_forgot_password);
      sKeys.put("layout/fragment_new_password_0", com.example.madiyar.R.layout.fragment_new_password);
      sKeys.put("layout/fragment_order_history_0", com.example.madiyar.R.layout.fragment_order_history);
      sKeys.put("layout/fragment_profile_0", com.example.madiyar.R.layout.fragment_profile);
      sKeys.put("layout/fragment_sms_code_0", com.example.madiyar.R.layout.fragment_sms_code);
      sKeys.put("layout/fragment_start_0", com.example.madiyar.R.layout.fragment_start);
      sKeys.put("layout/fragment_user_main_page_0", com.example.madiyar.R.layout.fragment_user_main_page);
    }
  }
}
