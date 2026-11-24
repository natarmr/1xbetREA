package org.xplatform.uikit.components.cells;

import a.bqd0;
import a.jab;
import a.tw5;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSettingsCell extends tw5 {
    public final int A;
    public final int B;
    public final int f1;
    public final int g1;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsSettingsCell(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.cellSettingsStyle);
        this.A = 1;
        this.B = 1;
        this.f1 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.k0, R.attr.cellSettingsStyle, 0);
        this.A = typedArrayObtainStyledAttributes.getInt(1, 1);
        this.B = typedArrayObtainStyledAttributes.getInt(2, 1);
        this.f1 = typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.recycle();
        this.g1 = getMinHeight();
    }

    @Override // a.tw5, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        KeyEvent.Callback cellRightView = getCellRightView();
        jab jabVar = cellRightView instanceof jab ? (jab) cellRightView : null;
        int i = this.A;
        if (jabVar != null) {
            jabVar.setLabelMaxLines(i);
        }
        View cellMiddleView = getCellMiddleView();
        DsCellMiddleTitle dsCellMiddleTitle = cellMiddleView instanceof DsCellMiddleTitle ? (DsCellMiddleTitle) cellMiddleView : null;
        if (dsCellMiddleTitle != null) {
            dsCellMiddleTitle.setTitleMaxLinesForce(i);
            dsCellMiddleTitle.setTitleMinLinesForce(this.B);
            dsCellMiddleTitle.setSubtitleMaxLines(this.f1);
        }
    }

    public final void setCellHeight(int i) {
        setMinHeight(Math.max(i, this.g1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSettingsCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSettingsCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
