package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddressBindingImpl extends FragmentAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view, 1);
        sViewsWithIds.put(R.id.tv_specify_address, 2);
        sViewsWithIds.put(R.id.til_home_address, 3);
        sViewsWithIds.put(R.id.et_home_address, 4);
        sViewsWithIds.put(R.id.til_apartment_number, 5);
        sViewsWithIds.put(R.id.et_apartment_number, 6);
        sViewsWithIds.put(R.id.til_additional_description, 7);
        sViewsWithIds.put(R.id.et_additional_description, 8);
        sViewsWithIds.put(R.id.btn_next, 9);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
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