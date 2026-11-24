package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zsa implements dta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f44897a;

    public zsa(zpv zpvVar) {
        this.f44897a = zpvVar;
    }

    @Override // a.dta
    public final zpv a() {
        return this.f44897a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsa) && this.f44897a.equals(((zsa) obj).f44897a);
    }

    public final int hashCode() {
        return this.f44897a.hashCode();
    }

    public final String toString() {
        return "SportTeams(headerActionsState=" + this.f44897a + Separators.RPAREN;
    }
}
