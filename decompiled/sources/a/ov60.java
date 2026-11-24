package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ov60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f25911a;
    public final cjm b;

    public ov60(hjm hjmVar, cjm cjmVar) {
        this.f25911a = hjmVar;
        this.b = cjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov60)) {
            return false;
        }
        ov60 ov60Var = (ov60) obj;
        return this.f25911a.equals(ov60Var.f25911a) && this.b.equals(ov60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25911a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesCollectionPresetUiModel(headerModel=" + this.f25911a + ", gamesModel=" + this.b + Separators.RPAREN;
    }
}
