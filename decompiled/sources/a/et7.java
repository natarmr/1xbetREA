package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class et7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8363a;
    public final k3p b;

    public et7(boolean z, k3p k3pVar) {
        this.f8363a = z;
        this.b = k3pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et7)) {
            return false;
        }
        et7 et7Var = (et7) obj;
        return this.f8363a == et7Var.f8363a && this.b.equals(et7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f8363a) * 31);
    }

    public final String toString() {
        return "BetsOnFavoriteEventsUiState(isExpanded=" + this.f8363a + ", favoriteCardState=" + this.b + Separators.RPAREN;
    }
}
