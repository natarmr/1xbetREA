package org.xplatform.lucky_wheel.presentation.views;

import a.esr;
import a.iav0;
import a.iun;
import a.m2x;
import a.si30;
import a.w23;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class WheelView extends View {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46765a;
    public List b;
    public boolean c;
    public Bitmap d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;

    /* JADX WARN: Illegal instructions before constructor call */
    public WheelView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = iun.f15405a;
        this.e = context.getDrawable(R.drawable.bg_wheel);
        this.f = context.getDrawable(R.drawable.bg_wheel_ny);
        this.g = context.getDrawable(R.drawable.ic_wheel_lights_ny);
        this.h = context.getDrawable(R.drawable.ic_wheel_active_sector);
    }

    private final float getItemSectorAngle() {
        return 360.0f / this.b.size();
    }

    public final ValueAnimator a(int i2, esr esrVar) {
        esrVar.getClass();
        int i3 = 0;
        for (iav0 iav0Var : this.b) {
            if (esrVar.b()) {
                esr esrVar2 = iav0Var.b;
                if (esrVar2 == esr.WILD_FREE_BET || esrVar2 == esr.FREE_BET) {
                    float itemSectorAngle = getItemSectorAngle();
                    float rotation = getRotation() % 360.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(rotation, (360.0f - ((i3 * itemSectorAngle) + rotation)) + (i2 * 360.0f) + rotation + 90.0f);
                    valueAnimatorOfFloat.getClass();
                    return valueAnimatorOfFloat;
                }
                i3++;
            } else {
                if (iav0Var.b == esrVar) {
                    float itemSectorAngle2 = getItemSectorAngle();
                    float rotation2 = getRotation() % 360.0f;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(rotation2, (360.0f - ((i3 * itemSectorAngle2) + rotation2)) + (i2 * 360.0f) + rotation2 + 90.0f);
                    valueAnimatorOfFloat2.getClass();
                    return valueAnimatorOfFloat2;
                }
                i3++;
            }
        }
        i3 = -1;
        float itemSectorAngle3 = getItemSectorAngle();
        float rotation3 = getRotation() % 360.0f;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(rotation3, (360.0f - ((i3 * itemSectorAngle3) + rotation3)) + (i2 * 360.0f) + rotation3 + 90.0f);
        valueAnimatorOfFloat3.getClass();
        return valueAnimatorOfFloat3;
    }

    public final void b() {
        Context context = getContext();
        context.getClass();
        this.d = m2x.p(getMeasuredWidth(), context, this.b);
    }

    public final boolean getShowActiveSector() {
        return this.c;
    }

    public final List<iav0> getWheelItems() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f46765a) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.g;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        } else {
            Drawable drawable3 = this.e;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
        if (this.c) {
            canvas.save();
            canvas.rotate(-getRotation(), getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            Drawable drawable4 = this.h;
            if (drawable4 != null) {
                drawable4.draw(canvas);
            }
            canvas.restore();
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i2, i3);
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, i2, i3);
        }
        Drawable drawable4 = this.h;
        if (drawable4 != null) {
            int iB = si30.b((i2 / 2.0f) * 0.562341f);
            drawable4.setBounds(i2 / 2, (i3 - iB) / 2, i2, (i3 + iB) / 2);
        }
        b();
    }

    public final void setNewYearMode(boolean z) {
        this.f46765a = z;
        invalidate();
    }

    public final void setShowActiveSector(boolean z) {
        this.c = z;
        invalidate();
    }

    public final void setWheelItems(List<iav0> list) {
        list.getClass();
        this.b = list;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 19));
        } else {
            b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WheelView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
