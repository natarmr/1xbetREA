package org.xplatform.uikit.components.cells.right;

import a.hab;
import a.z9f;
import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightListCheckBox extends DsListCheckBox implements hab {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightListCheckBox(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightListCheckBoxStyle);
        setCheckedChangeListener(new z9f(this, (byte) 15));
    }

    @Override // a.hab
    public final boolean e() {
        return true;
    }

    @Override // a.hab
    public final boolean j() {
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        setChecked(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightListCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightListCheckBox(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
