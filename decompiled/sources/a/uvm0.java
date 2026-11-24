package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uvm0 implements wvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36357a;
    public final long b;
    public final int c;
    public final String d;

    public uvm0(String str, long j, long j2, int i) {
        this.f36357a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
    }

    @Override // a.xvm0
    public final long a() {
        return this.b;
    }

    @Override // a.wvm0
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvm0)) {
            return false;
        }
        uvm0 uvm0Var = (uvm0) obj;
        return this.f36357a == uvm0Var.f36357a && this.b == uvm0Var.b && this.c == uvm0Var.c && Intrinsics.d(this.d, uvm0Var.d);
    }

    @Override // a.xvm0
    public final long getId() {
        return this.f36357a;
    }

    @Override // a.wvm0
    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, rw2.b(Long.hashCode(this.f36357a) * 31, 31, this.b), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f36357a, "BetsOnPlayers(id=", ", gameId=");
        ua80.v(sbQ, this.b, ", typeId=", this.c);
        return rw2.o(sbQ, ", name=", this.d, Separators.RPAREN);
    }
}
