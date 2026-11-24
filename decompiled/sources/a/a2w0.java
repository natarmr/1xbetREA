package a;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class a2w0 extends wa5 {
    public final int v;

    public a2w0(int i) {
        this.v = i;
        this.c = 0.0f;
    }

    @Override // a.wa5
    public final void a(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        float f3 = this.q ? this.t : f - ((fAbs / 100.0f) * 10.0f);
        this.t = f3;
        float f4 = this.r ? this.s : f2 + ((fAbs / 100.0f) * 10.0f);
        this.s = f4;
        this.u = Math.abs(f3 - f4);
    }

    public final float d(Paint paint) {
        paint.setTextSize(this.d);
        String strB = b();
        DisplayMetrics displayMetrics = dut0.f6713a;
        return Math.max(0.0f, Math.min((this.b * 2.0f) + ((int) paint.measureText(strB)), Float.POSITIVE_INFINITY));
    }
}
