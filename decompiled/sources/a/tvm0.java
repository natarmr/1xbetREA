package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tvm0 implements xvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34607a;
    public final long b;
    public final int c;
    public final String d;

    public tvm0(String str, long j, long j2, int i) {
        this.f34607a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
    }

    @Override // a.xvm0
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvm0)) {
            return false;
        }
        tvm0 tvm0Var = (tvm0) obj;
        return this.f34607a == tvm0Var.f34607a && this.b == tvm0Var.b && this.c == tvm0Var.c && Intrinsics.d(this.d, tvm0Var.d);
    }

    @Override // a.xvm0
    public final long getId() {
        return this.f34607a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, rw2.b(Long.hashCode(this.f34607a) * 31, 31, this.b), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34607a, "Main(id=", ", gameId=");
        ua80.v(sbQ, this.b, ", typeId=", this.c);
        return rw2.o(sbQ, ", name=", this.d, Separators.RPAREN);
    }
}
