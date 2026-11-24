package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bta implements dta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f3173a;

    public bta(zpv zpvVar) {
        this.f3173a = zpvVar;
    }

    @Override // a.dta
    public final zpv a() {
        return this.f3173a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bta) && this.f3173a.equals(((bta) obj).f3173a);
    }

    public final int hashCode() {
        return this.f3173a.hashCode();
    }

    public final String toString() {
        return "SportTracked(headerActionsState=" + this.f3173a + Separators.RPAREN;
    }
}
