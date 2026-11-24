package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lal0 implements nal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19711a;
    public final j5a0 b;
    public final j5a0 c;
    public final kal0 d;

    public lal0(String str, j5a0 j5a0Var, j5a0 j5a0Var2, kal0 kal0Var) {
        str.getClass();
        this.f19711a = str;
        this.b = j5a0Var;
        this.c = j5a0Var2;
        this.d = kal0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lal0)) {
            return false;
        }
        lal0 lal0Var = (lal0) obj;
        return Intrinsics.d(this.f19711a, lal0Var.f19711a) && this.b.equals(lal0Var.b) && this.c.equals(lal0Var.c) && Intrinsics.d(this.d, lal0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f19711a.hashCode() * 31)) * 31)) * 31;
        kal0 kal0Var = this.d;
        return iHashCode + (kal0Var == null ? 0 : kal0Var.hashCode());
    }

    public final String toString() {
        return "Pair(name=" + this.f19711a + ", firstPlayerLogo=" + this.b + ", secondPlayerLogo=" + this.c + ", additionalInfo=" + this.d + Separators.RPAREN;
    }
}
