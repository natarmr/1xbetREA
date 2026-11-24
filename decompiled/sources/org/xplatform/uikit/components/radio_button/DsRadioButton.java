package org.xplatform.uikit.components.radio_button;

import a.oac;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: loaded from: classes5.dex */
public final class DsRadioButton extends MaterialRadioButton {
    public static final /* synthetic */ int h = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsRadioButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        setOnCheckedChangeListener(new oac(this, (byte) 3));
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        setChecked(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsRadioButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
