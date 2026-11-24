package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class bxf implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3374a;
    public final float b;
    public final int c;
    public final int d;

    public bxf(float f, float f2, float f3, w6k w6kVar, float f4) {
        this.f3374a = f;
        this.b = f2;
        int iB = si30.b(f + f3);
        this.c = iB;
        this.d = si30.b(f4) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Integer numValueOf;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.c;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f3374a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
        Function0 function0 = new Function0(this) { // from class: a.axf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i2;
                k6z k6zVar = k6z.f17794a;
                long j = jFloatToRawIntBits;
                float fD = h7k0.d(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                wfg0 wfg0VarU = r8x.u(k9x.r(0L, j), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new pe80(wfg0VarU);
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (r8x.S(wfg0VarU)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (wfg0VarU.e >> 32));
                    canvas2.drawRoundRect(f2, f3 - (wfg0VarU.a() / 2.0f), (wfg0VarU.b() * i10) + f2, (wfg0VarU.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    w03 w03VarA = z03.a();
                    w03.b(w03VarA, wfg0VarU);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (wfg0VarU.a() / 2.0f));
                    canvas2.drawPath(w03VarA.f38329a, paint2);
                    canvas2.restore();
                }
                return Unit.f46060a;
            }
        };
        if (Float.isNaN(Float.NaN)) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Double.NaN));
        }
        function0.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.d;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
