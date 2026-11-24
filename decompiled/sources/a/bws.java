package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bws implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f3341a;
    public final boolean b;
    public final boolean c;

    public bws(a2n a2nVar, boolean z, boolean z2) {
        this.f3341a = a2nVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bws)) {
            return false;
        }
        bws bwsVar = (bws) obj;
        return this.f3341a.equals(bwsVar.f3341a) && this.b == bwsVar.b && this.c == bwsVar.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f3341a.getKey();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f3341a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameUiItem(model=");
        sb.append(this.f3341a);
        sb.append(", supportRtl=");
        sb.append(this.b);
        sb.append(", multiRows=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
