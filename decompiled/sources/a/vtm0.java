package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vtm0 extends agc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38015a;
    public final float b;
    public final int c;
    public final int d;
    public final x03 e;

    public vtm0(float f, float f2, int i, int i2, x03 x03Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        x03Var = (i3 & 16) != 0 ? null : x03Var;
        this.f38015a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = x03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtm0)) {
            return false;
        }
        vtm0 vtm0Var = (vtm0) obj;
        return this.f38015a == vtm0Var.f38015a && this.b == vtm0Var.b && this.c == vtm0Var.c && this.d == vtm0Var.d && Intrinsics.d(this.e, vtm0Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, twn.a(this.c, defpackage.c.a(Float.hashCode(this.f38015a) * 31, this.b, 31), 31), 31);
        x03 x03Var = this.e;
        return iA + (x03Var != null ? x03Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbS = dw9.s(this.f38015a, this.b, "Stroke(width=", ", miter=", ", cap=");
        f140.v(sbS, str, ", join=", str2, ", pathEffect=");
        sbS.append(this.e);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
