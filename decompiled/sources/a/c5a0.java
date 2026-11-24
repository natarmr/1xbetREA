package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c5a0 implements h5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f3761a;

    public c5a0(d280 d280Var) {
        this.f3761a = d280Var;
    }

    @Override // a.h5a0
    public final d280 a() {
        return this.f3761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5a0) && this.f3761a.equals(((c5a0) obj).f3761a);
    }

    public final int hashCode() {
        return this.f3761a.hashCode();
    }

    public final String toString() {
        return "WithoutFavoriteIcon(playerIcon=" + this.f3761a + Separators.RPAREN;
    }
}
