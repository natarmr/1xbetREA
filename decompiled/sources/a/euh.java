package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class euh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8420a;
    public final int b;

    public euh(String str, int i) {
        this.f8420a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euh)) {
            return false;
        }
        euh euhVar = (euh) obj;
        return this.f8420a.equals(euhVar.f8420a) && this.b == euhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f8420a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "CyclingCardJerseyUiModel(veloJerseyLeaderType=", this.f8420a, ", veloJerseyType=", Separators.RPAREN);
    }
}
