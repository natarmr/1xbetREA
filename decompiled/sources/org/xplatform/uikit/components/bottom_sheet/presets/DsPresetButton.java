package org.xplatform.uikit.components.bottom_sheet.presets;

import a.bqd0;
import a.hny;
import a.ktt0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes.dex */
public final class DsPresetButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47226a;
    public int b;
    public final DsButton c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPresetButton(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47226a = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        DsButton dsButton = new DsButton(context, attributeSet2, 6, 0);
        this.c = dsButton;
        addView(dsButton);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.a0, 0, 0);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 2);
        dsButton.l(strP == null ? "" : strP);
        dsButton.d(typedArrayObtainStyledAttributes.getResourceId(1, R.style.DSButton_Small_Primary));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        DsButton dsButton = this.c;
        ViewGroup.LayoutParams layoutParams = dsButton.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        marginLayoutParams.setMarginStart(this.f47226a);
        marginLayoutParams.setMarginEnd(this.f47226a);
        int i3 = this.b;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i3;
        dsButton.setLayoutParams(marginLayoutParams);
    }

    public final void setButtonStyle(int i) {
        this.c.d(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public final void setLoading(boolean z) {
        this.c.setLoading(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setText(String str) {
        str.getClass();
        this.c.l(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
