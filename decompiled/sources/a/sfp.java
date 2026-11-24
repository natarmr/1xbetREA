package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sfp extends t9p {
    public final gtr b;

    public sfp(gtr gtrVar) {
        super("X_GAMES", iun.f15405a);
        this.b = gtrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfp) && this.b.equals(((sfp) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b.f11894a) - 742948026;
    }

    public final String toString() {
        return "FavouriteGameCardShimmersCollection(id=X_GAMES, content=" + this.b + Separators.RPAREN;
    }
}
