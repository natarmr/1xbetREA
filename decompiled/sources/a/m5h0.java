package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m5h0 implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fos f21219a;

    public m5h0(fos fosVar) {
        this.f21219a = fosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5h0) && this.f21219a.equals(((m5h0) obj).f21219a);
    }

    public final int hashCode() {
        return this.f21219a.hashCode();
    }

    public final String toString() {
        return "ScoreTableUiState(gamePeriodsUiModel=" + this.f21219a + Separators.RPAREN;
    }
}
