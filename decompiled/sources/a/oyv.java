package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v21 f26076a;

    public oyv(v21 v21Var) {
        this.f26076a = v21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyv) && this.f26076a == ((oyv) obj).f26076a;
    }

    public final int hashCode() {
        return this.f26076a.hashCode();
    }

    public final String toString() {
        return "SelectedGameType(gameType=" + this.f26076a + Separators.RPAREN;
    }
}
