package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nfz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epe f23459a;

    public nfz(epe epeVar) {
        this.f23459a = epeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfz) && this.f23459a == ((nfz) obj).f23459a;
    }

    public final int hashCode() {
        return this.f23459a.hashCode();
    }

    public final String toString() {
        return "OnTeamsTypeSelect(selectedType=" + this.f23459a + Separators.RPAREN;
    }
}
