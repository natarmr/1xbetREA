package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ata implements dta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f1424a;

    public ata(zpv zpvVar) {
        this.f1424a = zpvVar;
    }

    @Override // a.dta
    public final zpv a() {
        return this.f1424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ata) && this.f1424a.equals(((ata) obj).f1424a);
    }

    public final int hashCode() {
        return this.f1424a.hashCode();
    }

    public final String toString() {
        return "SportTournaments(headerActionsState=" + this.f1424a + Separators.RPAREN;
    }
}
