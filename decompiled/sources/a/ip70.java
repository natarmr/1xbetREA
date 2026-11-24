package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ip70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15149a;
    public final boolean b;
    public final boolean c;
    public final csr d;

    public ip70(boolean z, boolean z2, boolean z3, csr csrVar) {
        csrVar.getClass();
        this.f15149a = z;
        this.b = z2;
        this.c = z3;
        this.d = csrVar;
    }

    public static ip70 a(ip70 ip70Var, boolean z, boolean z2, boolean z3, csr csrVar, int i) {
        if ((i & 1) != 0) {
            z = ip70Var.f15149a;
        }
        if ((i & 2) != 0) {
            z2 = ip70Var.b;
        }
        if ((i & 4) != 0) {
            z3 = ip70Var.c;
        }
        if ((i & 8) != 0) {
            csrVar = ip70Var.d;
        }
        ip70Var.getClass();
        csrVar.getClass();
        return new ip70(z, z2, z3, csrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip70)) {
            return false;
        }
        ip70 ip70Var = (ip70) obj;
        return this.f15149a == ip70Var.f15149a && this.b == ip70Var.b && this.c == ip70Var.c && Intrinsics.d(this.d, ip70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f15149a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ViewState(showBonusButton=", ", toolbarBlocked=", ", backButtonBlocked=", this.f15149a, this.b);
        sbQ.append(this.c);
        sbQ.append(", bonus=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
