package org.xplatform.uikit.components.bottom_sheet.presets;

import a.bqd0;
import a.cem0;
import a.ktt0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsPresetTitle extends AppCompatTextView {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsPresetTitle(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        setTag("DsPresetTitleTestTag");
        setTextAlignment(4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.d0, 0, 0);
        setTitleStyle(typedArrayObtainStyledAttributes.getResourceId(1, R.style.TextStyle_Title_Bold_M_TextPrimary));
        setTitle(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitleStyle(int i) {
        cem0.n(i, this);
    }

    public final void setTitle(CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTitle(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
