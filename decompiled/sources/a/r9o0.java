package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30094a;
    public final int b;
    public final int c;

    public r9o0(String str, int i, int i2) {
        str.getClass();
        this.f30094a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9o0)) {
            return false;
        }
        r9o0 r9o0Var = (r9o0) obj;
        return Intrinsics.d(this.f30094a, r9o0Var.f30094a) && this.b == r9o0Var.b && this.c == r9o0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f30094a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "SystemIdInfo(workSpecId=", this.f30094a, ", generation=", ", systemId="));
    }
}
