package a;

import android.gov.nist.core.Separators;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ttd0 extends ijj0 {
    public final List c;
    public final long d;
    public final float e;

    public ttd0(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // a.ijj0
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jU = p7x.u(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fD = this.e;
        if (fD == Float.POSITIVE_INFINITY) {
            fD = h7k0.d(j) / 2.0f;
        }
        float f = fD;
        List list = this.c;
        ntr.x0(list, null);
        if (Build.VERSION.SDK_INT >= 29) {
            return vbv.f37157a.b(jFloatToRawIntBits, f, ntr.v0(list), null, 0);
        }
        int iZ = ntr.Z(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, ntr.h0(iZ, list), ntr.i0(iZ, null, list), knx.R(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttd0)) {
            return false;
        }
        ttd0 ttd0Var = (ttd0) obj;
        return Intrinsics.d(this.c, ttd0Var.c) && ne60.c(this.d, ttd0Var.d) && this.e == ttd0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + defpackage.c.a(rw2.b(this.c.hashCode() * 961, 31, this.d), this.e, 31);
    }

    public final String toString() {
        long j = this.d;
        String strL = (9223372034707292159L & j) != 9205357640488583168L ? kng0.l("center=", ne60.h(j), ", ") : "";
        float f = this.e;
        return rw2.o(ua80.o("RadialGradient(colors=", ", stops=null, ", strL, this.c, (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? rw2.j(f, "radius=", ", ") : ""), "tileMode=", knm0.u(0), Separators.RPAREN);
    }
}
