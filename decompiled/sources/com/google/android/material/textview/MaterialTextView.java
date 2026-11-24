package com.google.android.material.textview;

import a.dwi0;
import a.g7x;
import a.n6x;
import a.rpd0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (n6x.R(context2, org.xbet.client1.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = rpd0.K;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iC = -1;
            for (int i = 0; i < 2 && iC < 0; i++) {
                iC = g7x.C(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, rpd0.J);
                Context context3 = getContext();
                int[] iArr3 = {2, 4};
                int iC2 = -1;
                for (int i2 = 0; i2 < 2 && iC2 < 0; i2++) {
                    iC2 = g7x.C(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iC2 >= 0) {
                    setLineHeight(iC2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (n6x.R(context, org.xbet.client1.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, rpd0.J);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iC = -1;
            for (int i2 = 0; i2 < 2 && iC < 0; i2++) {
                iC = g7x.C(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC >= 0) {
                setLineHeight(iC);
            }
        }
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }
}
