package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShopBindingImpl extends FragmentShopBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout, 1);
        sViewsWithIds.put(R.id.cardView5, 2);
        sViewsWithIds.put(R.id.textView57, 3);
        sViewsWithIds.put(R.id.textView62, 4);
        sViewsWithIds.put(R.id.ratingBar_indicator, 5);
        sViewsWithIds.put(R.id.imageView10, 6);
        sViewsWithIds.put(R.id.textView63, 7);
        sViewsWithIds.put(R.id.imageView12, 8);
        sViewsWithIds.put(R.id.textView64, 9);
        sViewsWithIds.put(R.id.imageView13, 10);
        sViewsWithIds.put(R.id.textView65, 11);
        sViewsWithIds.put(R.id.imageView14, 12);
        sViewsWithIds.put(R.id.imageView15, 13);
        sViewsWithIds.put(R.id.btn_basket, 14);
        sViewsWithIds.put(R.id.linearLayout, 15);
        sViewsWithIds.put(R.id.textView101, 16);
        sViewsWithIds.put(R.id.cv_apple, 17);
        sViewsWithIds.put(R.id.imageView20, 18);
        sViewsWithIds.put(R.id.textView102, 19);
        sViewsWithIds.put(R.id.textView103, 20);
        sViewsWithIds.put(R.id.textView104, 21);
        sViewsWithIds.put(R.id.cv_orange, 22);
        sViewsWithIds.put(R.id.imageView201, 23);
        sViewsWithIds.put(R.id.textView1021, 24);
        sViewsWithIds.put(R.id.textView1031, 25);
        sViewsWithIds.put(R.id.textView1041, 26);
        sViewsWithIds.put(R.id.imageView22, 27);
        sViewsWithIds.put(R.id.bottom_sheet, 28);
        sViewsWithIds.put(R.id.textView97, 29);
        sViewsWithIds.put(R.id.textView98, 30);
        sViewsWithIds.put(R.id.textView99, 31);
        sViewsWithIds.put(R.id.cardView33, 32);
        sViewsWithIds.put(R.id.cardView2, 33);
        sViewsWithIds.put(R.id.cardView3, 34);
        sViewsWithIds.put(R.id.textView100, 35);
        sViewsWithIds.put(R.id.button2, 36);
        sViewsWithIds.put(R.id.button3, 37);
        sViewsWithIds.put(R.id.textView105, 38);
        sViewsWithIds.put(R.id.imageView19, 39);
        sViewsWithIds.put(R.id.button6, 40);
        sViewsWithIds.put(R.id.imageView1812, 41);
        sViewsWithIds.put(R.id.textView106, 42);
        sViewsWithIds.put(R.id.textView107, 43);
        sViewsWithIds.put(R.id.btn_add, 44);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentShopBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }
    private FragmentShopBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[28]
            , (android.widget.Button) bindings[44]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[36]
            , (android.widget.Button) bindings[37]
            , (android.widget.Button) bindings[40]
            , (androidx.cardview.widget.CardView) bindings[33]
            , (androidx.cardview.widget.CardView) bindings[34]
            , (androidx.cardview.widget.CardView) bindings[32]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RatingBar) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[42]
            , (android.widget.TextView) bindings[43]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            );
        this.userMainPageFragment.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}