package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4402a;
    public final String b;

    public cia0(String str, String str2) {
        this.f4402a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cia0)) {
            return false;
        }
        cia0 cia0Var = (cia0) obj;
        return this.f4402a.equals(cia0Var.f4402a) && this.b.equals(cia0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4402a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PlayersStatisticCricketInfoUiModel(abbreviation=", this.f4402a, ", transcription=", this.b, Separators.RPAREN);
    }
}
