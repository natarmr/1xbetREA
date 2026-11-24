package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bh8 implements ih8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2593a;
    public final String b;
    public final String c;
    public final boolean d;
    public final tf5 e;
    public final n0x f;

    public bh8(int i, String str, String str2, boolean z, tf5 tf5Var, n0x n0xVar) {
        str.getClass();
        str2.getClass();
        this.f2593a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = tf5Var;
        this.f = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh8)) {
            return false;
        }
        bh8 bh8Var = (bh8) obj;
        return this.f2593a == bh8Var.f2593a && Intrinsics.d(this.b, bh8Var.b) && Intrinsics.d(this.c, bh8Var.c) && this.d == bh8Var.d && this.e.equals(bh8Var.e) && this.f.equals(bh8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f2593a) * 31, 31, this.b), 31, this.c), 31, true), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f2593a, "Content(id=", ", title=", this.b, ", description=");
        brm0.C(this.c, ", isEnable=true, isSelected=", ", selectedBadgeStyle=", sbR, this.d);
        sbR.append(this.e);
        sbR.append(", background=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
