package org.xplatform.uikit.components.cells.right;

import a.hab;
import a.oac;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.checkbox.b;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DsCellRightRadioButton extends b implements hab {
    public static final /* synthetic */ int g1 = 0;
    public boolean f1;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightRadioButton(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightRadioButtonStyle);
        this.f1 = true;
        setOnCheckedChangeListener(new oac(this, b));
        setTag("DsCellRightRadioButtonTestTag");
    }

    @Override // a.hab
    public final boolean e() {
        return this.f1;
    }

    @Override // a.hab
    public final boolean j() {
        return false;
    }

    @Override // a.hab
    public final boolean k() {
        return true;
    }

    public final void setDefaultClickHandleEnabled(boolean z) {
        this.f1 = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        setChecked(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightRadioButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
