package org.xplatform.uikit.components.cells.right;

import a.hab;
import a.ni30;
import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class DsCellRightSwitch extends ni30 implements hab {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightSwitch(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightSwitch(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
