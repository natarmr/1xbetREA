package org.xplatform.uikit.components.cells.right;

import a.hab;
import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightButton extends DsButton implements hab {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellRightButtonStyle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
