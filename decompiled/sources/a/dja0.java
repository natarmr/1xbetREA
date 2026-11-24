package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6175a;
    public final String b;

    public dja0(String str, String str2) {
        this.f6175a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dja0)) {
            return false;
        }
        dja0 dja0Var = (dja0) obj;
        return this.f6175a.equals(dja0Var.f6175a) && this.b.equals(dja0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6175a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PlayersStatisticInfoUiModel(abbreviation=", this.f6175a, ", transcription=", this.b, Separators.RPAREN);
    }
}
