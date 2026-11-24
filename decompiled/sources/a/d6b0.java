package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d6b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hws f5543a;

    public d6b0(hws hwsVar) {
        this.f5543a = hwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6b0) && this.f5543a.equals(((d6b0) obj).f5543a);
    }

    public final int hashCode() {
        return this.f5543a.hashCode();
    }

    public final String toString() {
        return "PopularClassicFeedUiState(gameUiState=" + this.f5543a + Separators.RPAREN;
    }
}
