package a;

import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class tab extends tub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33606a;

    @Override // a.tub0
    public final float a(g7k0 g7k0Var, g7k0 g7k0Var2) {
        switch (this.f33606a) {
            case 0:
                if (g7k0Var.f10819a <= 0 || g7k0Var.b <= 0) {
                    return 0.0f;
                }
                g7k0 g7k0VarA = g7k0Var.a(g7k0Var2);
                float f = g7k0VarA.f10819a * 1.0f;
                float fPow = f / g7k0Var.f10819a;
                if (fPow > 1.0f) {
                    fPow = (float) Math.pow(1.0f / fPow, 1.1d);
                }
                float f2 = ((g7k0VarA.b * 1.0f) / g7k0Var2.b) + (f / g7k0Var2.f10819a);
                return ((1.0f / f2) / f2) * fPow;
            case 1:
                if (g7k0Var.f10819a <= 0 || g7k0Var.b <= 0) {
                    return 0.0f;
                }
                g7k0 g7k0VarB = g7k0Var.b(g7k0Var2);
                float f3 = g7k0VarB.f10819a;
                float fPow2 = (f3 * 1.0f) / g7k0Var.f10819a;
                if (fPow2 > 1.0f) {
                    fPow2 = (float) Math.pow(1.0f / fPow2, 1.1d);
                }
                float f4 = ((g7k0Var2.b * 1.0f) / g7k0VarB.b) * ((g7k0Var2.f10819a * 1.0f) / f3);
                return (((1.0f / f4) / f4) / f4) * fPow2;
            default:
                int i = g7k0Var.f10819a;
                int i2 = g7k0Var.b;
                if (i <= 0 || i2 <= 0) {
                    return 0.0f;
                }
                int i3 = g7k0Var2.f10819a;
                int i4 = g7k0Var2.b;
                float f5 = (i * 1.0f) / i3;
                if (f5 < 1.0f) {
                    f5 = 1.0f / f5;
                }
                float f6 = i2;
                float f7 = i4;
                float f8 = (f6 * 1.0f) / f7;
                if (f8 < 1.0f) {
                    f8 = 1.0f / f8;
                }
                float f9 = (1.0f / f5) / f8;
                float f10 = ((i * 1.0f) / f6) / ((i3 * 1.0f) / f7);
                if (f10 < 1.0f) {
                    f10 = 1.0f / f10;
                }
                return (((1.0f / f10) / f10) / f10) * f9;
        }
    }

    @Override // a.tub0
    public final Rect b(g7k0 g7k0Var, g7k0 g7k0Var2) {
        switch (this.f33606a) {
            case 0:
                g7k0 g7k0VarA = g7k0Var.a(g7k0Var2);
                Log.i("tab", "Preview: " + g7k0Var + "; Scaled: " + g7k0VarA + "; Want: " + g7k0Var2);
                int i = g7k0VarA.f10819a;
                int i2 = (i - g7k0Var2.f10819a) / 2;
                int i3 = g7k0VarA.b;
                int i4 = (i3 - g7k0Var2.b) / 2;
                return new Rect(-i2, -i4, i - i2, i3 - i4);
            case 1:
                g7k0 g7k0VarB = g7k0Var.b(g7k0Var2);
                Log.i("tab", "Preview: " + g7k0Var + "; Scaled: " + g7k0VarB + "; Want: " + g7k0Var2);
                int i5 = g7k0VarB.f10819a;
                int i6 = (i5 - g7k0Var2.f10819a) / 2;
                int i7 = g7k0VarB.b;
                int i8 = (i7 - g7k0Var2.b) / 2;
                return new Rect(-i6, -i8, i5 - i6, i7 - i8);
            default:
                return new Rect(0, 0, g7k0Var2.f10819a, g7k0Var2.b);
        }
    }
}
