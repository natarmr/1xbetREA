package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gz40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12163a;
    public float b;
    public float c;
    public float d;
    public float e;

    public gz40(gz40 gz40Var) {
        this.f12163a = (byte) 1;
        this.b = gz40Var.b;
        this.c = gz40Var.c;
        this.d = gz40Var.d;
        this.e = gz40Var.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.f12163a) {
            case 0:
                String strR = plc.R(this.b);
                String strR2 = plc.R(this.c);
                return ua80.m(b1j.n("MutableRect(", strR, ", ", strR2, ", "), plc.R(this.d), ", ", plc.R(this.e), Separators.RPAREN);
            default:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.b);
                sb.append(Separators.SP);
                sb.append(this.c);
                sb.append(Separators.SP);
                sb.append(this.d);
                sb.append(Separators.SP);
                return kng0.o(sb, this.e, "]");
        }
    }

    public gz40(float f, float f2, float f3, float f4) {
        this.f12163a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public gz40() {
        this.f12163a = (byte) 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
