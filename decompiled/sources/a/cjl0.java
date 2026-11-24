package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjl0 f4466a;
    public final hjl0 b;
    public final a4x c;

    public cjl0(hjl0 hjl0Var, hjl0 hjl0Var2, i4 i4Var) {
        i4Var.getClass();
        this.f4466a = hjl0Var;
        this.b = hjl0Var2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjl0)) {
            return false;
        }
        cjl0 cjl0Var = (cjl0) obj;
        return this.f4466a.equals(cjl0Var.f4466a) && this.b.equals(cjl0Var.b) && Intrinsics.d(this.c, cjl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4466a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(teamOneModel=");
        sb.append(this.f4466a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", info=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
