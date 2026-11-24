package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zy20 implements az20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45185a;

    public final boolean equals(Object obj) {
        if (obj instanceof zy20) {
            return this.f45185a.equals(((zy20) obj).f45185a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45185a.hashCode();
    }

    public final String toString() {
        return kng0.l("SubGamesSearchQueryChange(query=", this.f45185a, Separators.RPAREN);
    }
}
