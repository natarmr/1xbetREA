package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f18399a;
    public final rqm b;

    public kjp0(bop0 bop0Var, rqm rqmVar) {
        this.f18399a = bop0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjp0)) {
            return false;
        }
        kjp0 kjp0Var = (kjp0) obj;
        return this.f18399a == kjp0Var.f18399a && this.b.equals(kjp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18399a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamSelectorItemUiModel(team=" + this.f18399a + ", style=" + this.b + Separators.RPAREN;
    }
}
