package org.xplatform.games_section.feature.daily_tournament.presentation;

import a.aqd0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class ForegroundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f46730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.j);
        typedArrayObtainStyledAttributes.getClass();
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        super.draw(canvas);
        Drawable drawable = this.f46730a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f46730a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f46730a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f46730a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f46730a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f46730a;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(drawable2);
        }
        this.f46730a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setForegroundResource(int i) {
        setForeground(getContext().getResources().getDrawable(i));
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        return super.verifyDrawable(drawable) || drawable == this.f46730a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForegroundImageView(Context context) {
        this(context, null);
        context.getClass();
    }
}
