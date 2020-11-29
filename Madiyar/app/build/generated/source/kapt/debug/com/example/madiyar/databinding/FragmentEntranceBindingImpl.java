package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntranceBindingImpl extends FragmentEntranceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_logo, 1);
        sViewsWithIds.put(R.id.til_email, 2);
        sViewsWithIds.put(R.id.et_email, 3);
        sViewsWithIds.put(R.id.til_password, 4);
        sViewsWithIds.put(R.id.et_password, 5);
        sViewsWithIds.put(R.id.tv_forgot_password, 6);
        sViewsWithIds.put(R.id.btn_enter, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntranceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentEntranceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.entranceLayout.setTag(null);
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