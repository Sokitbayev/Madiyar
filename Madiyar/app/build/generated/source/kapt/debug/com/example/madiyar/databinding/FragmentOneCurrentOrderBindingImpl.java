package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOneCurrentOrderBindingImpl extends FragmentOneCurrentOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView38, 1);
        sViewsWithIds.put(R.id.textView39, 2);
        sViewsWithIds.put(R.id.card_view, 3);
        sViewsWithIds.put(R.id.textView44, 4);
        sViewsWithIds.put(R.id.textView45, 5);
        sViewsWithIds.put(R.id.card_view1, 6);
        sViewsWithIds.put(R.id.textView40, 7);
        sViewsWithIds.put(R.id.textView41, 8);
        sViewsWithIds.put(R.id.cardView, 9);
        sViewsWithIds.put(R.id.textView42, 10);
        sViewsWithIds.put(R.id.textView43, 11);
        sViewsWithIds.put(R.id.textView46, 12);
        sViewsWithIds.put(R.id.imageView6, 13);
        sViewsWithIds.put(R.id.textView47, 14);
        sViewsWithIds.put(R.id.textView48, 15);
        sViewsWithIds.put(R.id.textView49, 16);
        sViewsWithIds.put(R.id.cardView2, 17);
        sViewsWithIds.put(R.id.textView50, 18);
        sViewsWithIds.put(R.id.textView51, 19);
        sViewsWithIds.put(R.id.cardView3, 20);
        sViewsWithIds.put(R.id.imageView7, 21);
        sViewsWithIds.put(R.id.textView52, 22);
        sViewsWithIds.put(R.id.textView53, 23);
        sViewsWithIds.put(R.id.textView54, 24);
        sViewsWithIds.put(R.id.textView55, 25);
        sViewsWithIds.put(R.id.textView56, 26);
        sViewsWithIds.put(R.id.cardView4, 27);
        sViewsWithIds.put(R.id.imageView70, 28);
        sViewsWithIds.put(R.id.textView71, 29);
        sViewsWithIds.put(R.id.textView72, 30);
        sViewsWithIds.put(R.id.textView74, 31);
        sViewsWithIds.put(R.id.textView75, 32);
        sViewsWithIds.put(R.id.textView, 33);
        sViewsWithIds.put(R.id.textView1, 34);
        sViewsWithIds.put(R.id.textView2, 35);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOneCurrentOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentOneCurrentOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[20]
            , (androidx.cardview.widget.CardView) bindings[27]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[32]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
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