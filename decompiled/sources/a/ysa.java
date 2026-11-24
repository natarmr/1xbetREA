package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ysa implements dta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f43157a;

    public ysa(zpv zpvVar) {
        this.f43157a = zpvVar;
    }

    @Override // a.dta
    public final zpv a() {
        return this.f43157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysa) && this.f43157a.equals(((ysa) obj).f43157a);
    }

    public final int hashCode() {
        return this.f43157a.hashCode();
    }

    public final String toString() {
        return "SportEvents(headerActionsState=" + this.f43157a + Separators.RPAREN;
    }
}
