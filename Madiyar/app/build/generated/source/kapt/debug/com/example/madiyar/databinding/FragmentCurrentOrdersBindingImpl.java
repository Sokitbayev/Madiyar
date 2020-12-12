package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCurrentOrdersBindingImpl extends FragmentCurrentOrdersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView58, 1);
        sViewsWithIds.put(R.id.textView59, 2);
        sViewsWithIds.put(R.id.textView60, 3);
        sViewsWithIds.put(R.id.cardView, 4);
        sViewsWithIds.put(R.id.textView42, 5);
        sViewsWithIds.put(R.id.textView43, 6);
        sViewsWithIds.put(R.id.textView46, 7);
        sViewsWithIds.put(R.id.imageView6, 8);
        sViewsWithIds.put(R.id.textView47, 9);
        sViewsWithIds.put(R.id.textView48, 10);
        sViewsWithIds.put(R.id.textView49, 11);
        sViewsWithIds.put(R.id.textView61, 12);
        sViewsWithIds.put(R.id.cardView1, 13);
        sViewsWithIds.put(R.id.textView421, 14);
        sViewsWithIds.put(R.id.textView431, 15);
        sViewsWithIds.put(R.id.textView461, 16);
        sViewsWithIds.put(R.id.imageView61, 17);
        sViewsWithIds.put(R.id.textView471, 18);
        sViewsWithIds.put(R.id.textView481, 19);
        sViewsWithIds.put(R.id.textView491, 20);
        sViewsWithIds.put(R.id.textView611, 21);
        sViewsWithIds.put(R.id.cardView2, 22);
        sViewsWithIds.put(R.id.textView422, 23);
        sViewsWithIds.put(R.id.textView432, 24);
        sViewsWithIds.put(R.id.textView462, 25);
        sViewsWithIds.put(R.id.imageView62, 26);
        sViewsWithIds.put(R.id.textView472, 27);
        sViewsWithIds.put(R.id.textView482, 28);
        sViewsWithIds.put(R.id.textView492, 29);
        sViewsWithIds.put(R.id.textView612, 30);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCurrentOrdersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentCurrentOrdersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[30]
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