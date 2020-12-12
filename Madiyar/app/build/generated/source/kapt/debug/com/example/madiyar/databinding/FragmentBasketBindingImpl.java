package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBasketBindingImpl extends FragmentBasketBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView66, 1);
        sViewsWithIds.put(R.id.textView67, 2);
        sViewsWithIds.put(R.id.textView68, 3);
        sViewsWithIds.put(R.id.textInputLayout2, 4);
        sViewsWithIds.put(R.id.textView70, 5);
        sViewsWithIds.put(R.id.cardView, 6);
        sViewsWithIds.put(R.id.imageView9, 7);
        sViewsWithIds.put(R.id.textView73, 8);
        sViewsWithIds.put(R.id.textView76, 9);
        sViewsWithIds.put(R.id.textView77, 10);
        sViewsWithIds.put(R.id.imageView18, 11);
        sViewsWithIds.put(R.id.imageView19, 12);
        sViewsWithIds.put(R.id.textView78, 13);
        sViewsWithIds.put(R.id.imageView8, 14);
        sViewsWithIds.put(R.id.cardView1, 15);
        sViewsWithIds.put(R.id.imageView91, 16);
        sViewsWithIds.put(R.id.textView731, 17);
        sViewsWithIds.put(R.id.textView761, 18);
        sViewsWithIds.put(R.id.textView771, 19);
        sViewsWithIds.put(R.id.imageView181, 20);
        sViewsWithIds.put(R.id.imageView191, 21);
        sViewsWithIds.put(R.id.textView781, 22);
        sViewsWithIds.put(R.id.imageView81, 23);
        sViewsWithIds.put(R.id.cardView2, 24);
        sViewsWithIds.put(R.id.imageView912, 25);
        sViewsWithIds.put(R.id.textView7312, 26);
        sViewsWithIds.put(R.id.textView7612, 27);
        sViewsWithIds.put(R.id.textView7712, 28);
        sViewsWithIds.put(R.id.imageView1812, 29);
        sViewsWithIds.put(R.id.imageView1912, 30);
        sViewsWithIds.put(R.id.textView7812, 31);
        sViewsWithIds.put(R.id.imageView812, 32);
        sViewsWithIds.put(R.id.btn_arrange, 33);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBasketBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentBasketBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[33]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[31]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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