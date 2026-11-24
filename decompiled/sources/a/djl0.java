package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class djl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjl0 f6193a;
    public final hjl0 b;
    public final String c;

    public djl0(hjl0 hjl0Var, hjl0 hjl0Var2, String str) {
        str.getClass();
        this.f6193a = hjl0Var;
        this.b = hjl0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djl0)) {
            return false;
        }
        djl0 djl0Var = (djl0) obj;
        return this.f6193a.equals(djl0Var.f6193a) && this.b.equals(djl0Var.b) && Intrinsics.d(this.c, djl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6193a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(teamOneModel=");
        sb.append(this.f6193a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
