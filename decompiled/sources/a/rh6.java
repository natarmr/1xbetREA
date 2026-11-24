package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rh6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30475a;
    public final long b;
    public final boolean c;
    public final long d;
    public final Long e;
    public final are f;
    public final boolean g;

    public rh6(long j, long j2, boolean z, long j3, Long l, are areVar, boolean z2) {
        this.f30475a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = l;
        this.f = areVar;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh6)) {
            return false;
        }
        rh6 rh6Var = (rh6) obj;
        return this.f30475a == rh6Var.f30475a && this.b == rh6Var.b && this.c == rh6Var.c && this.d == rh6Var.d && Intrinsics.d(this.e, rh6Var.e) && this.f.equals(rh6Var.f) && this.g == rh6Var.g;
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e(rw2.b(Long.hashCode(this.f30475a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((iB + (l == null ? 0 : l.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30475a, "BetBuilderGameParamsModel(gameId=", ", userId=");
        hne.t(this.b, ", cutCoef=", sbQ, this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", marketType=");
        sbQ.append(this.e);
        sbQ.append(", countryModel=");
        sbQ.append(this.f);
        sbQ.append(", live=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
