package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class bhf {
    public static final zgf Companion = new zgf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2603a;
    public final rk10 b;
    public final nff c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final jhf g;

    public /* synthetic */ bhf(int i, Long l, rk10 rk10Var, nff nffVar, Double d, Double d2, Double d3, jhf jhfVar) {
        if ((i & 1) == 0) {
            this.f2603a = null;
        } else {
            this.f2603a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rk10Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = nffVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = jhfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhf)) {
            return false;
        }
        bhf bhfVar = (bhf) obj;
        return Intrinsics.d(this.f2603a, bhfVar.f2603a) && Intrinsics.d(this.b, bhfVar.b) && this.c == bhfVar.c && Intrinsics.d(this.d, bhfVar.d) && Intrinsics.d(this.e, bhfVar.e) && Intrinsics.d(this.f, bhfVar.f) && Intrinsics.d(this.g, bhfVar.g);
    }

    public final int hashCode() {
        Long l = this.f2603a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        rk10 rk10Var = this.b;
        int iHashCode2 = (iHashCode + (rk10Var == null ? 0 : rk10Var.hashCode())) * 31;
        nff nffVar = this.c;
        int iHashCode3 = (iHashCode2 + (nffVar == null ? 0 : nffVar.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        jhf jhfVar = this.g;
        return iHashCode6 + (jhfVar != null ? jhfVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrystalResponse(accountId=");
        sb.append(this.f2603a);
        sb.append(", bonusInfo=");
        sb.append(this.b);
        sb.append(", gameStatus=");
        sb.append(this.c);
        sb.append(", coeff=");
        sb.append(this.d);
        sb.append(", winSum=");
        vqd.w(sb, this.e, ", balanceNew=", this.f, ", roundState=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
