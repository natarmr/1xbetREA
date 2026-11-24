package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gr1 extends lr1 {
    public final mdp c;

    public gr1(mdp mdpVar) {
        super(mr1.b, new cm1(mdpVar));
        this.c = mdpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr1) && this.c == ((gr1) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Favorites(favoritesType=" + this.c + Separators.RPAREN;
    }

    public /* synthetic */ gr1() {
        this(mdp.f21607a);
    }
}
