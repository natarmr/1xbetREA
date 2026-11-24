package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n1z implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1z f22776a;
    public final mdm b;

    public n1z(h1z h1zVar, mdm mdmVar) {
        this.f22776a = h1zVar;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1z)) {
            return false;
        }
        n1z n1zVar = (n1z) obj;
        return this.f22776a.equals(n1zVar.f22776a) && this.b.equals(n1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22776a.hashCode() * 31);
    }

    public final String toString() {
        return "LastGamesUiState(lastGamesUiModel=" + this.f22776a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
