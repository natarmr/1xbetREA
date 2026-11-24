package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class akb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1014a;
    public final jjm b;
    public final vb90 c;

    public akb(String str, jjm jjmVar, vb90 vb90Var) {
        this.f1014a = str;
        this.b = jjmVar;
        this.c = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        return this.f1014a.equals(akbVar.f1014a) && this.b.equals(akbVar.b) && this.c.equals(akbVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f1014a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f1014a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChampionshipGameCardUiModel(key=" + this.f1014a + ", dsModel=" + this.b + ", peekingGameCardUiModel=" + this.c + Separators.RPAREN;
    }
}
