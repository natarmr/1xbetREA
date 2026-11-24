package org.xplatform.uikit.components.bottom_sheet.presets;

import a.bqd0;
import a.hny;
import a.ktt0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class DsPresetTwoButtons extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsButton f47228a;
    public final DsButton b;
    public int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPresetTwoButtons(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        int i2 = 0;
        super(context, attributeSet, 0);
        int i3 = 6;
        DsButton dsButton = new DsButton(context, attributeSet2, i3, i2);
        this.f47228a = dsButton;
        DsButton dsButton2 = new DsButton(context, attributeSet2, i3, i2);
        this.b = dsButton2;
        this.c = -2;
        addView(dsButton);
        addView(dsButton2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.e0, 0, 0);
        setFirstButtonStyle(typedArrayObtainStyledAttributes.getResourceId(2, R.style.DSButton_Small_Primary));
        setFirstButtonText(ktt0.p(typedArrayObtainStyledAttributes, context, 5));
        setFirstButtonIcon(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        setSecondButtonStyle(typedArrayObtainStyledAttributes.getResourceId(4, R.style.DSButton_Small_Primary));
        setSecondButtonText(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
        setSecondButtonIcon(typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_8);
        int orientation = getOrientation();
        DsButton dsButton = this.b;
        DsButton dsButton2 = this.f47228a;
        if (orientation != 0) {
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.space_6);
            ViewGroup.LayoutParams layoutParams = dsButton2.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = this.c;
            marginLayoutParams.topMargin = dimensionPixelOffset;
            marginLayoutParams.bottomMargin = dimensionPixelOffset2;
            dsButton2.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams2 = dsButton.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = this.c;
            marginLayoutParams2.bottomMargin = dimensionPixelOffset;
            marginLayoutParams2.topMargin = dimensionPixelOffset2;
            dsButton.setLayoutParams(marginLayoutParams2);
            return;
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.space_4);
        int measuredWidth = (int) ((((double) getMeasuredWidth()) / 2.0d) - ((double) dimensionPixelOffset3));
        ViewGroup.LayoutParams layoutParams3 = dsButton2.getLayoutParams();
        if (layoutParams3 == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.width = measuredWidth;
        marginLayoutParams3.height = this.c;
        marginLayoutParams3.setMarginEnd(dimensionPixelOffset3);
        marginLayoutParams3.topMargin = dimensionPixelOffset;
        marginLayoutParams3.bottomMargin = dimensionPixelOffset;
        dsButton2.setLayoutParams(marginLayoutParams3);
        ViewGroup.LayoutParams layoutParams4 = dsButton.getLayoutParams();
        if (layoutParams4 == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.width = measuredWidth;
        marginLayoutParams4.height = this.c;
        marginLayoutParams4.setMarginStart(dimensionPixelOffset3);
        marginLayoutParams4.topMargin = dimensionPixelOffset;
        marginLayoutParams4.bottomMargin = dimensionPixelOffset;
        dsButton.setLayoutParams(marginLayoutParams4);
    }

    public final void setButtonsHeight(int i) {
        this.c = getResources().getDimensionPixelSize(i);
    }

    public final void setFirstButtonClickListener(View.OnClickListener onClickListener) {
        this.f47228a.setOnClickListener(onClickListener);
    }

    public final void setFirstButtonIcon(int i) {
        this.f47228a.i(i);
    }

    public final void setFirstButtonStyle(int i) {
        this.f47228a.d(i);
    }

    public final void setFirstButtonText(int i) {
        setFirstButtonText(getContext().getString(i));
    }

    public final void setSecondButtonClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void setSecondButtonIcon(int i) {
        this.b.i(i);
    }

    public final void setSecondButtonStyle(int i) {
        this.b.d(i);
    }

    public final void setSecondButtonText(int i) {
        setSecondButtonText(getContext().getString(i));
    }

    public final void setFirstButtonText(CharSequence charSequence) {
        this.f47228a.l(String.valueOf(charSequence));
    }

    public final void setSecondButtonText(CharSequence charSequence) {
        this.b.l(String.valueOf(charSequence));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTwoButtons(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTwoButtons(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
