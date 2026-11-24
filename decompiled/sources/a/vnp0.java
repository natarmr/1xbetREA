package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vnp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37730a;
    public final zrm b;
    public final boolean c;

    public vnp0(long j, zrm zrmVar, boolean z) {
        this.f37730a = j;
        this.b = zrmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnp0)) {
            return false;
        }
        vnp0 vnp0Var = (vnp0) obj;
        return this.f37730a == vnp0Var.f37730a && this.b.equals(vnp0Var.b) && this.c == vnp0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        zrm zrmVar = this.b;
        return this.f37730a + Separators.SP + zrmVar.f44861a.a() + zrmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f37730a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamUiItem(id=");
        sb.append(this.f37730a);
        sb.append(", model=");
        sb.append(this.b);
        return f140.n(sb, ", favorite=", this.c, Separators.RPAREN);
    }
}
