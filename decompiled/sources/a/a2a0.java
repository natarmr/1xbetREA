package a;

import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f116a;
    public final /* synthetic */ q2a0 b;

    public /* synthetic */ a2a0(q2a0 q2a0Var, byte b) {
        this.f116a = b;
        this.b = q2a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116a) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & pi9Var.f27033a.d())) / 2.0f;
                zcl zclVar = qmk.f28987a;
                float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) - (pi9Var.getDensity() * 2.0f);
                q2a0 q2a0Var = this.b;
                a4x a4xVar = q2a0Var.f27992a;
                return pi9Var.a(new enm((Object) xww.x(fIntBitsToFloat, fIntBitsToFloat2, fMin, a4xVar, new er90((byte) 6)), (Object) q2a0Var, (Object) xww.x(fIntBitsToFloat, fIntBitsToFloat2, fMin, a4xVar, new er90((byte) 7)), (Object) new vtm0(pi9Var.getDensity() * 1.0f, 0.0f, 1, 1, null, 18), (byte) 24));
            default:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                final float fIntBitsToFloat3 = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) / 2.0f;
                final float fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & pi9Var2.f27033a.d())) / 2.0f;
                zcl zclVar2 = qmk.f28987a;
                final float density = (pi9Var2.getDensity() * 70.0f) - (pi9Var2.getDensity() * 2.0f);
                final float density2 = pi9Var2.getDensity() * 8.0f;
                final float density3 = pi9Var2.getDensity() * 6.0f;
                final Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(fbc.U(StaticColors.INSTANCE.m130getWhite600d7_KjU()));
                paint.setTextSize(pi9Var2.X(qmk.q));
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                final Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                final float f = (fontMetrics.bottom - fontMetrics.top) / 2.0f;
                final q2a0 q2a0Var2 = this.b;
                final int size = q2a0Var2.f27992a.size();
                return pi9Var2.a(new Function1() { // from class: a.c2a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        fhl fhlVar = (fhl) obj2;
                        fhlVar.getClass();
                        int i = 0;
                        for (Object obj3 : q2a0Var2.f27992a) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            o2a0 o2a0Var = (o2a0) obj3;
                            float f2 = ((i / size) * 360.0f) - 90.0f;
                            float f3 = 0.017453292f * f2;
                            boolean z = -120.0f <= f2 && f2 <= -60.0f;
                            boolean z2 = 60.0f <= f2 && f2 <= 120.0f;
                            float f4 = density + density2 + ((z || z2) ? f : 0.0f);
                            double d = f3;
                            boolean z3 = z2;
                            float fCos = (((float) Math.cos(d)) * f4) + fIntBitsToFloat3;
                            float fSin = (((float) Math.sin(d)) * f4) + fIntBitsToFloat4;
                            Paint.Align align = (z || z3) ? Paint.Align.CENTER : (-60.0f > f2 || f2 > 60.0f) ? Paint.Align.RIGHT : Paint.Align.LEFT;
                            Paint paint2 = paint;
                            paint2.setTextAlign(align);
                            Paint.Align textAlign = paint2.getTextAlign();
                            int i3 = textAlign == null ? -1 : d2a0.f5346a[textAlign.ordinal()];
                            float f5 = density3;
                            if (i3 == 1) {
                                fCos += f5;
                            } else if (i3 == 2) {
                                fCos -= f5;
                            }
                            Paint.FontMetrics fontMetrics2 = fontMetrics;
                            vw2.b(fhlVar.A0().i()).drawText(o2a0Var.i, fCos, fSin - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), paint2);
                            i = i2;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }
}
