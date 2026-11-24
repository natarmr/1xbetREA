package org.xplatform.ui_core.viewcomponents.layouts.frame;

import a.a8z;
import a.aqd0;
import a.h3c0;
import a.ha30;
import a.maz;
import a.wez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ProgressBarWithSandClockNew extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47192a;
    public final Animation b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressBarWithSandClockNew(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47192a = maz.a(wez.b, new ha30(this, this, (byte) 25));
        this.b = AnimationUtils.loadAnimation(context, R.anim.rotate);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.q);
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
            colorStateListValueOf.getClass();
            getBinding().c.setImageTintList(colorStateListValueOf);
            getBinding().b.setImageTintList(colorStateListValueOf);
            getBinding().c.setAlpha(1.0f);
            getBinding().b.setAlpha(1.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final h3c0 getBinding() {
        return (h3c0) this.f47192a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.startAnimation(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().b.startAnimation(this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithSandClockNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithSandClockNew(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
