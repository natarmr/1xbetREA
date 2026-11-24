package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l0 f13405a;
    public final h8l0 b;
    public final boolean c;

    public hop(j8l0 j8l0Var, h8l0 h8l0Var, boolean z) {
        this.f13405a = j8l0Var;
        this.b = h8l0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hop)) {
            return false;
        }
        hop hopVar = (hop) obj;
        return this.f13405a == hopVar.f13405a && this.b == hopVar.b && this.c == hopVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f13405a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedsScreenConfig(listStyle=");
        sb.append(this.f13405a);
        sb.append(", headerStyle=");
        sb.append(this.b);
        sb.append(", hasCyberVirtualTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
