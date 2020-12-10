package com.example.madiyar.databinding;
import com.example.madiyar.R;
import com.example.madiyar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderHistoryDetailedBindingImpl extends FragmentOrderHistoryDetailedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView29, 1);
        sViewsWithIds.put(R.id.textView37, 2);
        sViewsWithIds.put(R.id.textView38, 3);
        sViewsWithIds.put(R.id.textView39, 4);
        sViewsWithIds.put(R.id.card_view, 5);
        sViewsWithIds.put(R.id.textView44, 6);
        sViewsWithIds.put(R.id.textView45, 7);
        sViewsWithIds.put(R.id.card_view1, 8);
        sViewsWithIds.put(R.id.textView40, 9);
        sViewsWithIds.put(R.id.textView41, 10);
        sViewsWithIds.put(R.id.cardView, 11);
        sViewsWithIds.put(R.id.textView42, 12);
        sViewsWithIds.put(R.id.textView43, 13);
        sViewsWithIds.put(R.id.textView46, 14);
        sViewsWithIds.put(R.id.imageView6, 15);
        sViewsWithIds.put(R.id.textView47, 16);
        sViewsWithIds.put(R.id.textView48, 17);
        sViewsWithIds.put(R.id.textView49, 18);
        sViewsWithIds.put(R.id.cardView2, 19);
        sViewsWithIds.put(R.id.textView50, 20);
        sViewsWithIds.put(R.id.textView51, 21);
        sViewsWithIds.put(R.id.cardView3, 22);
        sViewsWithIds.put(R.id.imageView7, 23);
        sViewsWithIds.put(R.id.textView52, 24);
        sViewsWithIds.put(R.id.textView53, 25);
        sViewsWithIds.put(R.id.textView54, 26);
        sViewsWithIds.put(R.id.textView55, 27);
        sViewsWithIds.put(R.id.textView56, 28);
        sViewsWithIds.put(R.id.imageView70, 29);
        sViewsWithIds.put(R.id.textView71, 30);
        sViewsWithIds.put(R.id.textView72, 31);
        sViewsWithIds.put(R.id.textView74, 32);
        sViewsWithIds.put(R.id.textView75, 33);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderHistoryDetailedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentOrderHistoryDetailedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[33]
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