package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f7403a;
    public final z740 b;
    public final boolean c;

    public e940(imm immVar, z740 z740Var, boolean z) {
        this.f7403a = immVar;
        this.b = z740Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e940)) {
            return false;
        }
        e940 e940Var = (e940) obj;
        return this.f7403a.equals(e940Var.f7403a) && this.b.equals(e940Var.b) && this.c == e940Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f7403a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesUiState(navigationBar=");
        sb.append(this.f7403a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
