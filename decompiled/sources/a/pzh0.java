package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pzh0 implements szh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f27846a;
    public final long b;
    public final String c;

    public pzh0(aud audVar, long j, String str) {
        audVar.getClass();
        str.getClass();
        this.f27846a = audVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzh0)) {
            return false;
        }
        pzh0 pzh0Var = (pzh0) obj;
        return Intrinsics.d(this.f27846a, pzh0Var.f27846a) && this.b == pzh0Var.b && Intrinsics.d(this.c, pzh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f27846a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendAddToCouponEffect(configureCouponResultModel=");
        sb.append(this.f27846a);
        sb.append(", champId=");
        sb.append(this.b);
        return rw2.o(sb, ", gameId=", this.c, Separators.RPAREN);
    }
}
