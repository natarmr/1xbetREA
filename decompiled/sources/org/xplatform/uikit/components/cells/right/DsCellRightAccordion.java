package org.xplatform.uikit.components.cells.right;

import a.hab;
import a.jmu0;
import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightAccordion extends DsAccordion implements hab {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightAccordion(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightRadioAccordionStyle);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightAccordion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightAccordion(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
