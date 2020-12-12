package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserMainPageBindingImpl extends FragmentUserMainPageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_zhasmine, 1);
        sViewsWithIds.put(R.id.iv_tmart, 2);
        sViewsWithIds.put(R.id.cv_current_orders, 3);
        sViewsWithIds.put(R.id.button, 4);
        sViewsWithIds.put(R.id.imageView11, 5);
        sViewsWithIds.put(R.id.appBarLayout, 6);
        sViewsWithIds.put(R.id.tab_layout, 7);
        sViewsWithIds.put(R.id.pager, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserMainPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentUserMainPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (androidx.viewpager.widget.ViewPager) bindings[8]
            , (com.google.android.material.tabs.TabLayout) bindings[7]
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