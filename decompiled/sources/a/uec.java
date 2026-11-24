package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f35519a;
    public final pec b;

    public uec(imm immVar, pec pecVar) {
        this.f35519a = immVar;
        this.b = pecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uec)) {
            return false;
        }
        uec uecVar = (uec) obj;
        return this.f35519a.equals(uecVar.f35519a) && this.b.equals(uecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35519a.hashCode() * 31);
    }

    public final String toString() {
        return "ChooseCountryUiState(headerModel=" + this.f35519a + ", screenUiState=" + this.b + Separators.RPAREN;
    }
}
