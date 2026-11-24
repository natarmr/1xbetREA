package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final evq0 f43325a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ yvl(evq0 evq0Var, boolean z, int i) {
        this((i & 1) != 0 ? evq0.b : evq0Var, true, (i & 4) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvl)) {
            return false;
        }
        yvl yvlVar = (yvl) obj;
        return this.f43325a == yvlVar.f43325a && this.b == yvlVar.b && this.c == yvlVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f43325a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCheckboxUiModel(state=");
        sb.append(this.f43325a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", error=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public yvl(evq0 evq0Var, boolean z, boolean z2) {
        evq0Var.getClass();
        this.f43325a = evq0Var;
        this.b = z;
        this.c = z2;
    }
}
