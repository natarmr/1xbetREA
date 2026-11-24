package org.xplatform.core.presentation.custom_views.cards;

import a.aqd0;
import a.epv0;
import a.hne;
import a.w6x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LuckyCardWidget extends View {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f46464a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Drawable f;
    public int g;
    public float h;
    public int i;
    public final Random j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public LuckyCardWidget(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46464a = epv0.U(R.drawable.card_back, context);
        this.j = new Random();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.m);
        typedArrayObtainStyledAttributes.getClass();
        this.k = typedArrayObtainStyledAttributes.getInteger(0, 4);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void a(LuckyCardWidget luckyCardWidget, ValueAnimator valueAnimator) {
        luckyCardWidget.setTranslateCard(((Integer) w6x.m(valueAnimator)).intValue());
    }

    public static final void b(LuckyCardWidget luckyCardWidget, ValueAnimator valueAnimator) {
        luckyCardWidget.setRotateCard(((Float) w6x.m(valueAnimator)).floatValue());
    }

    private final void setRotateCard(float f) {
        this.h = f;
        invalidate();
    }

    private final void setTranslateCard(int i) {
        this.g = i;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.d;
        int i2 = this.k;
        canvas.translate(0.0f, (i2 / 2) * i);
        while (i2 > 0) {
            boolean z = this.e;
            Drawable drawable = this.f46464a;
            if (!z || i2 != this.i) {
                int i3 = (!z || i2 >= this.i) ? 0 : (int) (this.h * this.d);
                if (drawable != null) {
                    int i4 = this.b / 2;
                    int i5 = this.c / 2;
                    int i6 = this.d * i2;
                    drawable.setBounds(width - i4, (height - i5) + i6 + i3, i4 + width, hne.D(i5, height, i6, i3));
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            } else if (z) {
                float f = this.h;
                if (f < 0.5f && f < 0.5f) {
                    int i7 = (width - (this.b / 2)) + this.g;
                    int i8 = (this.d * i2) + (height - (this.c / 2));
                    canvas.save();
                    canvas.scale((0.5f - this.h) * 2.0f, 1.0f, (this.b / 2) + i7, (this.c / 2) + i8);
                    if (drawable != null) {
                        drawable.setBounds(i7, i8, this.b + i7, this.c + i8);
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                }
            }
            if (this.e && this.h > 0.5f) {
                int i9 = (width - (this.b / 2)) + this.g;
                int i10 = height - (this.c / 2);
                canvas.save();
                canvas.scale((this.h - 0.5f) * 2.0f, 1.0f, (this.b / 2) + i9, (this.c / 2) + i10);
                Drawable drawable2 = this.f;
                if (drawable2 == null) {
                    Intrinsics.h("showCardDrawable");
                    throw null;
                }
                drawable2.setBounds(i9, i10, this.b + i9, this.c + i10);
                Drawable drawable3 = this.f;
                if (drawable3 == null) {
                    Intrinsics.h("showCardDrawable");
                    throw null;
                }
                drawable3.draw(canvas);
                canvas.restore();
            }
            i2--;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f46464a;
        if (drawable != null) {
            this.c = (int) (getMeasuredHeight() * 0.4f);
            float intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            int i3 = this.c;
            this.b = (int) (intrinsicWidth * i3);
            this.d = (int) (i3 * 0.03f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyCardWidget(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
