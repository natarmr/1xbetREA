package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fx70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f10296a;

    public fx70(zpv zpvVar) {
        this.f10296a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f10296a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx70) && this.f10296a.equals(((fx70) obj).f10296a);
    }

    public final int hashCode() {
        return this.f10296a.hashCode();
    }

    public final String toString() {
        return "SportTeams(headerActionsState=" + this.f10296a + Separators.RPAREN;
    }
}
