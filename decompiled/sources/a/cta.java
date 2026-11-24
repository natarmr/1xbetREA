package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cta implements dta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f4926a;

    public cta(zpv zpvVar) {
        this.f4926a = zpvVar;
    }

    @Override // a.dta
    public final zpv a() {
        return this.f4926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cta) && this.f4926a.equals(((cta) obj).f4926a);
    }

    public final int hashCode() {
        return this.f4926a.hashCode();
    }

    public final String toString() {
        return "Viewed(headerActionsState=" + this.f4926a + Separators.RPAREN;
    }
}
