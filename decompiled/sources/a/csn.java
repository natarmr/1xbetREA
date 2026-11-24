package a;

import android.content.Context;
import android.graphics.Color;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class csn {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4898a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public csn(Context context) {
        boolean zR = n6x.R(context, R.attr.elevationOverlayEnabled, false);
        Integer numY = d7x.y(R.attr.elevationOverlayColor, context);
        int iIntValue = numY != null ? numY.intValue() : 0;
        Integer numY2 = d7x.y(R.attr.elevationOverlayAccentColor, context);
        int iIntValue2 = numY2 != null ? numY2.intValue() : 0;
        Integer numY3 = d7x.y(R.attr.colorSurface, context);
        int iIntValue3 = numY3 != null ? numY3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4898a = zR;
        this.b = iIntValue;
        this.c = iIntValue2;
        this.d = iIntValue3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.f4898a || k5d.e(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iF = d7x.F(k5d.e(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iF = k5d.c(k5d.e(i2, f), iF);
        }
        return k5d.e(iF, iAlpha);
    }
}
