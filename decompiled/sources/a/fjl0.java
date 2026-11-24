package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjl0 f9647a;
    public final hjl0 b;
    public final String c;

    public fjl0(hjl0 hjl0Var, hjl0 hjl0Var2, String str) {
        str.getClass();
        this.f9647a = hjl0Var;
        this.b = hjl0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjl0)) {
            return false;
        }
        fjl0 fjl0Var = (fjl0) obj;
        return this.f9647a.equals(fjl0Var.f9647a) && this.b.equals(fjl0Var.b) && Intrinsics.d(this.c, fjl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9647a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(teamOneModel=");
        sb.append(this.f9647a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
