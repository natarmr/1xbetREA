package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q380 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28039a;
    public final int b;
    public final String c;
    public final chl0 d;
    public final Integer e;
    public final v12 f;

    public q380(String str, int i, String str2, chl0 chl0Var, Integer num, v12 v12Var) {
        this.f28039a = str;
        this.b = i;
        this.c = str2;
        this.d = chl0Var;
        this.e = num;
        this.f = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q380)) {
            return false;
        }
        q380 q380Var = (q380) obj;
        return this.f28039a.equals(q380Var.f28039a) && this.b == q380Var.b && this.c.equals(q380Var.c) && this.d.equals(q380Var.d) && Intrinsics.d(this.e, q380Var.e) && this.f == q380Var.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f28039a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ua80.b(twn.a(this.b, this.f28039a.hashCode() * 31, 31), 31, this.c)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "OpponentUiModel(key=", this.f28039a, ", id=", ", opponentImage=");
        sbP.append(this.c);
        sbP.append(", sportMarketDsModel=");
        sbP.append(this.d);
        sbP.append(", gameId=");
        sbP.append(this.e);
        sbP.append(", alignmentInSection=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
