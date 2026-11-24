package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rvm0 implements xvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31177a;
    public final long b;
    public final String c;

    public rvm0(long j, long j2, String str) {
        this.f31177a = j;
        this.b = j2;
        this.c = str;
    }

    @Override // a.xvm0
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvm0)) {
            return false;
        }
        rvm0 rvm0Var = (rvm0) obj;
        return this.f31177a == rvm0Var.f31177a && this.b == rvm0Var.b && Intrinsics.d(this.c, rvm0Var.c);
    }

    @Override // a.xvm0
    public final long getId() {
        return this.f31177a;
    }

    public final int hashCode() {
        int iB = rw2.b(Long.hashCode(this.f31177a) * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31177a, "Duel(id=", ", gameId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
