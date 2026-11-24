package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.epv0;
import a.hab;
import a.hne;
import a.hny;
import a.m5d;
import a.maz;
import a.n0o0;
import a.nvl;
import a.qg60;
import a.t9f;
import a.yg3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightDragAndDrop extends FrameLayout implements hab {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nvl f47232a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ImageView f;
    public final DsListCheckBox g;
    public final n0o0 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellRightDragAndDrop(Context context, AttributeSet attributeSet, int i2) {
        boolean z;
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.cellRightDragAndDropStyle);
        nvl nvlVar = nvl.f24192a;
        this.f47232a = nvlVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.d = dimensionPixelSize3;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_48);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
        imageView.setImageDrawable(epv0.U(R.drawable.ic_glyph_reorder, context));
        imageView.setImageTintList(m5d.a(context, m5d.b(R.attr.uikitSecondary, context), m5d.b(R.attr.uikitSecondary20, context)));
        this.f = imageView;
        DsListCheckBox dsListCheckBox = new DsListCheckBox(context, null, 6, 0);
        dsListCheckBox.setDuplicateParentStateEnabled(true);
        this.g = dsListCheckBox;
        this.h = maz.b(new yg3(context, (byte) 29));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, bqd0.q, R.attr.cellRightDragAndDropStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            nvlVar = nvl.c;
            this.f47232a = nvlVar;
        } else if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            nvlVar = nvl.b;
            this.f47232a = nvlVar;
        } else {
            this.f47232a = nvlVar;
        }
        int iOrdinal = nvlVar.ordinal();
        if (iOrdinal == 0) {
            removeView(getButton());
            removeView(dsListCheckBox);
        } else if (iOrdinal == 1) {
            removeView(dsListCheckBox);
            if (getButton().getParent() == null) {
                addView(getButton());
                z = getLayoutDirection() == 1;
                int i3 = z ? dimensionPixelSize : dimensionPixelSize3 + dimensionPixelSize2;
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if (layoutParams3 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    throw null;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                if (z) {
                    layoutParams4.setMarginStart(i3);
                } else {
                    layoutParams4.setMarginEnd(i3);
                }
                imageView.setLayoutParams(layoutParams4);
                DsButton button = getButton();
                ViewGroup.LayoutParams layoutParams5 = button.getLayoutParams();
                if (layoutParams5 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    throw null;
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.gravity = 16;
                if (z) {
                    layoutParams6.setMarginStart(dimensionPixelSize);
                } else {
                    layoutParams6.setMarginStart(dimensionPixelSize3 + dimensionPixelSize2);
                }
                button.setLayoutParams(layoutParams6);
                getButton().i(resourceId);
            }
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                throw null;
            }
            removeView(getButton());
            if (dsListCheckBox.getParent() == null) {
                addView(dsListCheckBox);
                z = getLayoutDirection() == 1;
                int i4 = z ? dimensionPixelSize : dimensionPixelSize3 + dimensionPixelSize2;
                ViewGroup.LayoutParams layoutParams7 = imageView.getLayoutParams();
                if (layoutParams7 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    throw null;
                }
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                if (z) {
                    layoutParams8.setMarginStart(i4);
                } else {
                    layoutParams8.setMarginEnd(i4);
                }
                imageView.setLayoutParams(layoutParams8);
                ViewGroup.LayoutParams layoutParams9 = dsListCheckBox.getLayoutParams();
                if (layoutParams9 == null) {
                    hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    throw null;
                }
                FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                layoutParams10.gravity = 16;
                if (z) {
                    layoutParams10.setMarginStart(dimensionPixelSize);
                } else {
                    layoutParams10.setMarginStart(dimensionPixelSize3 + dimensionPixelSize2);
                }
                dsListCheckBox.setLayoutParams(layoutParams10);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final DsButton getButton() {
        return (DsButton) this.h.getValue();
    }

    public final nvl getStyle() {
        return this.f47232a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredWidth;
        int i4 = this.d;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        ImageView imageView = this.f;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredWidth3 = 0;
        if (this.f47232a == nvl.c) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            DsListCheckBox dsListCheckBox = this.g;
            dsListCheckBox.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            measuredWidth = dsListCheckBox.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (this.f47232a == nvl.b) {
            getButton().measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            measuredWidth3 = getButton().getMeasuredWidth();
        }
        nvl nvlVar = this.f47232a;
        nvl nvlVar2 = nvl.f24192a;
        int i5 = this.b;
        if (nvlVar != nvlVar2) {
            i5 += this.c;
        }
        setMeasuredDimension(hne.D(measuredWidth2, measuredWidth, measuredWidth3, i5), this.e);
    }

    public final void setCheckBoxChecked(boolean z) {
        this.g.setChecked(z);
        super.setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        DsListCheckBox dsListCheckBox = this.g;
        if (dsListCheckBox != null) {
            dsListCheckBox.setEnabled(z);
        }
        DsButton button = getButton();
        if (button != null) {
            button.setEnabled(z);
        }
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        getButton().setOnClickListener(onClickListener);
    }

    public final void setOnCheckBoxCheckedChangeListener(qg60 qg60Var) {
        this.g.setCheckedChangeListener(qg60Var);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (this.g.getVisibility() == 0) {
            setCheckBoxChecked(z);
        }
    }

    public final void setStyle(nvl nvlVar) {
        nvlVar.getClass();
        this.f47232a = nvlVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightDragAndDrop(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightDragAndDrop(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
