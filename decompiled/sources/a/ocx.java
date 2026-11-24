package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ocx implements qcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25050a;
    public final String b;

    public ocx(String str, String str2) {
        this.f25050a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocx)) {
            return false;
        }
        ocx ocxVar = (ocx) obj;
        return this.f25050a.equals(ocxVar.f25050a) && this.b.equals(ocxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25050a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("InjuryDataUiModel(date=", this.f25050a, ", injury=", this.b, Separators.RPAREN);
    }
}
