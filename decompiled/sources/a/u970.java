package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s970 f35271a;
    public final t970 b;
    public final r970 c;

    public u970(s970 s970Var, t970 t970Var, r970 r970Var) {
        this.f35271a = s970Var;
        this.b = t970Var;
        this.c = r970Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u970)) {
            return false;
        }
        u970 u970Var = (u970) obj;
        return this.f35271a.equals(u970Var.f35271a) && this.b.equals(u970Var.b) && this.c.equals(u970Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35271a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OneXGamesWebGameDisableDemoDialogUiState(content=" + this.f35271a + ", topContent=" + this.b + ", bottomContent=" + this.c + Separators.RPAREN;
    }
}
