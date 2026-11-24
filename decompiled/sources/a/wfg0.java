package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39069a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        r8x.v(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public wfg0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f39069a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.f39069a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfg0)) {
            return false;
        }
        wfg0 wfg0Var = (wfg0) obj;
        return Float.compare(this.f39069a, wfg0Var.f39069a) == 0 && Float.compare(this.b, wfg0Var.b) == 0 && Float.compare(this.c, wfg0Var.c) == 0 && Float.compare(this.d, wfg0Var.d) == 0 && ozb.M(this.e, wfg0Var.e) && ozb.M(this.f, wfg0Var.f) && ozb.M(this.g, wfg0Var.g) && ozb.M(this.h, wfg0Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + rw2.b(rw2.b(rw2.b(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f39069a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strR = plc.R(this.f39069a);
        String strR2 = plc.R(this.b);
        String strR3 = plc.R(this.c);
        String strR4 = plc.R(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strR);
        sb.append(", ");
        sb.append(strR2);
        sb.append(", ");
        sb.append(strR3);
        String strN = axq.n(sb, ", ", strR4);
        long j = this.e;
        long j2 = this.f;
        boolean zM = ozb.M(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zM && ozb.M(j2, j3) && ozb.M(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return b1j.k("RoundRect(rect=", strN, ", radius=", plc.R(Float.intBitsToFloat(i)), Separators.RPAREN);
            }
            String strR5 = plc.R(Float.intBitsToFloat(i));
            return axq.n(b1j.n("RoundRect(rect=", strN, ", x=", strR5, ", y="), plc.R(Float.intBitsToFloat(i2)), Separators.RPAREN);
        }
        String strG0 = ozb.g0(j);
        String strG1 = ozb.g0(j2);
        String strG2 = ozb.g0(j3);
        String strG3 = ozb.g0(j4);
        StringBuilder sbN = b1j.n("RoundRect(rect=", strN, ", topLeft=", strG0, ", topRight=");
        f140.v(sbN, strG1, ", bottomRight=", strG2, ", bottomLeft=");
        return axq.n(sbN, strG3, Separators.RPAREN);
    }
}
