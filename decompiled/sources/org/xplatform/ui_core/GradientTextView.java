package org.xplatform.ui_core;

import a.aqd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class GradientTextView extends AppCompatTextView {
    public int i;
    public int j;

    /* JADX WARN: Illegal instructions before constructor call */
    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.k);
        typedArrayObtainStyledAttributes.getClass();
        this.i = typedArrayObtainStyledAttributes.getInteger(1, 0);
        this.j = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getPaint().setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.j, this.i, Shader.TileMode.CLAMP));
        }
    }

    public final void setEndColor(int i) {
        this.j = i;
    }

    public final void setStartColor(int i) {
        this.i = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
