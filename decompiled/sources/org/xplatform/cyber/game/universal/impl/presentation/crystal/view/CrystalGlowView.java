package org.xplatform.cyber.game.universal.impl.presentation.crystal.view;

import a.a8z;
import a.maz;
import a.wez;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalGlowView;

/* JADX INFO: loaded from: classes3.dex */
public final class CrystalGlowView extends View {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46526a;
    public final int b;
    public final a8z c;
    public final a8z d;
    public float e;
    public float f;
    public float g;
    public final float h;

    /* JADX WARN: Illegal instructions before constructor call */
    public CrystalGlowView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b = 0;
        super(context, attributeSet, 0);
        this.f46526a = context.getColor(R.color.cyber_synthetic_crystal_glow_bg);
        this.b = context.getColor(R.color.cyber_synthetic_crystal_glow_border);
        Function0 function0 = new Function0(this) { // from class: a.xff
            public final /* synthetic */ CrystalGlowView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                CrystalGlowView crystalGlowView = this.b;
                switch (b2) {
                    case 0:
                        int i3 = CrystalGlowView.i;
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setColor(crystalGlowView.f46526a);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setMaskFilter(new BlurMaskFilter(crystalGlowView.f, BlurMaskFilter.Blur.NORMAL));
                        paint.setStrokeWidth(crystalGlowView.f);
                        return paint;
                    default:
                        int i4 = CrystalGlowView.i;
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setColor(crystalGlowView.b);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(crystalGlowView.g);
                        paint2.setMaskFilter(new BlurMaskFilter(crystalGlowView.g, BlurMaskFilter.Blur.SOLID));
                        return paint2;
                }
            }
        };
        wez wezVar = wez.b;
        this.c = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.d = maz.a(wezVar, new Function0(this) { // from class: a.xff
            public final /* synthetic */ CrystalGlowView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                CrystalGlowView crystalGlowView = this.b;
                switch (b3) {
                    case 0:
                        int i3 = CrystalGlowView.i;
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setColor(crystalGlowView.f46526a);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setMaskFilter(new BlurMaskFilter(crystalGlowView.f, BlurMaskFilter.Blur.NORMAL));
                        paint.setStrokeWidth(crystalGlowView.f);
                        return paint;
                    default:
                        int i4 = CrystalGlowView.i;
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setColor(crystalGlowView.b);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(crystalGlowView.g);
                        paint2.setMaskFilter(new BlurMaskFilter(crystalGlowView.g, BlurMaskFilter.Blur.SOLID));
                        return paint2;
                }
            }
        });
        this.h = context.getResources().getDimension(R.dimen.corner_radius_4);
    }

    private final Paint getGlowPaint() {
        return (Paint) this.c.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.d.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float f = this.f;
        float f2 = this.e - f;
        RectF rectF = new RectF(f, f, f2, f2);
        Paint glowPaint = getGlowPaint();
        float f3 = this.h;
        canvas.drawRoundRect(rectF, f3, f3, glowPaint);
        canvas.drawRoundRect(rectF, f3, f3, getLinePaint());
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        float measuredWidth = getMeasuredHeight() > getMeasuredWidth() ? getMeasuredWidth() : getMeasuredHeight();
        this.e = measuredWidth;
        float f = measuredWidth * 0.04f;
        this.f = f;
        this.g = f / 2.0f;
        setMeasuredDimension(i2, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalGlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalGlowView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
