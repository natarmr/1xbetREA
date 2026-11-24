package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rj60 implements sj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30577a;
    public final float b;
    public final float c;
    public final z9q0 d;
    public final boolean e;

    public rj60(String str, float f, float f2, z9q0 z9q0Var, boolean z) {
        str.getClass();
        this.f30577a = str;
        this.b = f;
        this.c = f2;
        this.d = z9q0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj60)) {
            return false;
        }
        rj60 rj60Var = (rj60) obj;
        return Intrinsics.d(this.f30577a, rj60Var.f30577a) && ycl.b(this.b, rj60Var.b) && ycl.b(this.c, rj60Var.c) && this.d == rj60Var.d && this.e == rj60Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + defpackage.c.a(defpackage.c.a(this.f30577a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(this.c);
        StringBuilder sbN = b1j.n("Text(text=", this.f30577a, ", paddingTop=", strC, ", paddingBottom=");
        sbN.append(strC2);
        sbN.append(", textStyle=");
        sbN.append(this.d);
        sbN.append(", hasBullet=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
