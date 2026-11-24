package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kgn implements f3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f18247a;

    public kgn(pz40 pz40Var) {
        this.f18247a = pz40Var;
    }

    @Override // a.f3u0
    public final Object a(bh90 bh90Var) {
        return ((hgk0) this.f18247a).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgn) && this.f18247a == ((kgn) obj).f18247a;
    }

    public final int hashCode() {
        return this.f18247a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f18247a + Separators.RPAREN;
    }
}
