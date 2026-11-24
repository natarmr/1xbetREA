package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2v0 f38470a;
    public final u2v0 b;
    public final g3v0 c;

    public w2v0(v2v0 v2v0Var, u2v0 u2v0Var, g3v0 g3v0Var) {
        this.f38470a = v2v0Var;
        this.b = u2v0Var;
        this.c = g3v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2v0)) {
            return false;
        }
        w2v0 w2v0Var = (w2v0) obj;
        return this.f38470a.equals(w2v0Var.f38470a) && this.b.equals(w2v0Var.b) && this.c.equals(w2v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f38470a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebGamesGameCollectionResolvedColors(pictureColors=" + this.f38470a + ", actionColors=" + this.b + ", techColors=" + this.c + Separators.RPAREN;
    }
}
