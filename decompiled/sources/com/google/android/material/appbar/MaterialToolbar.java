package com.google.android.material.appbar;

import a.akj0;
import a.dwi0;
import a.i120;
import a.k7x;
import a.ki30;
import a.mrv;
import a.plc;
import a.rpd0;
import a.tgo0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] A1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer v1;
    public boolean w1;
    public boolean x1;
    public ImageView.ScaleType y1;
    public Boolean z1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.L, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayL0.hasValue(2)) {
            setNavigationIconTint(typedArrayL0.getColor(2, -1));
        }
        this.w1 = typedArrayL0.getBoolean(6, false);
        this.x1 = typedArrayL0.getBoolean(5, false);
        int i = typedArrayL0.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = A1;
            if (i < scaleTypeArr.length) {
                this.y1 = scaleTypeArr[i];
            }
        }
        if (typedArrayL0.hasValue(0)) {
            this.z1 = Boolean.valueOf(typedArrayL0.getBoolean(0, false));
        }
        typedArrayL0.recycle();
        akj0 akj0VarC = akj0.h(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).c();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : plc.F(background);
        if (colorStateListValueOf != null) {
            ki30 ki30Var = new ki30(akj0VarC);
            ki30Var.s(colorStateListValueOf);
            ki30Var.o(context2);
            ki30Var.r(getElevation());
            setBackground(ki30Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.y1;
    }

    public Integer getNavigationIconTint() {
        return this.v1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ki30) {
            k7x.V(this, (ki30) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        tgo0 tgo0Var = i120.l;
        ImageView imageView2 = null;
        if (this.w1 || this.x1) {
            ArrayList arrayListB0 = i120.b0(this, getTitle());
            TextView textView = arrayListB0.isEmpty() ? null : (TextView) Collections.min(arrayListB0, tgo0Var);
            ArrayList arrayListB1 = i120.b0(this, getSubtitle());
            TextView textView2 = arrayListB1.isEmpty() ? null : (TextView) Collections.max(arrayListB1, tgo0Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.w1 && textView != null) {
                    u(textView, pair);
                }
                if (this.x1 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.z1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.y1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ki30) {
            ((ki30) background).r(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.z1;
        if (bool == null || bool.booleanValue() != z) {
            this.z1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.y1 != scaleType) {
            this.y1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.v1 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.v1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.v1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.x1 != z) {
            this.x1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.w1 != z) {
            this.w1 = z;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
