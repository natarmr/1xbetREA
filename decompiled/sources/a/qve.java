package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qve implements xve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f29382a;
    public final ctc b;
    public final ms2 c;
    public final long d;
    public final String e;

    public qve(aud audVar, ctc ctcVar, ms2 ms2Var, long j, String str) {
        audVar.getClass();
        ctcVar.getClass();
        ms2Var.getClass();
        str.getClass();
        this.f29382a = audVar;
        this.b = ctcVar;
        this.c = ms2Var;
        this.d = j;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qve)) {
            return false;
        }
        qve qveVar = (qve) obj;
        return Intrinsics.d(this.f29382a, qveVar.f29382a) && this.b == qveVar.b && Intrinsics.d(this.c, qveVar.c) && this.d == qveVar.d && Intrinsics.d(this.e, qveVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b((this.c.hashCode() + ((this.b.hashCode() + (this.f29382a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleLongTapResult(configureCouponResultModel=");
        sb.append(this.f29382a);
        sb.append(", clickType=");
        sb.append(this.b);
        sb.append(", entryPointType=");
        sb.append(this.c);
        sb.append(", champId=");
        sb.append(this.d);
        return rw2.o(sb, ", gameId=", this.e, Separators.RPAREN);
    }
}
