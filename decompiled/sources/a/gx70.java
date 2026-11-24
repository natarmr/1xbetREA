package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gx70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f12064a;

    public gx70(zpv zpvVar) {
        this.f12064a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f12064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx70) && this.f12064a.equals(((gx70) obj).f12064a);
    }

    public final int hashCode() {
        return this.f12064a.hashCode();
    }

    public final String toString() {
        return "SportTournaments(headerActionsState=" + this.f12064a + Separators.RPAREN;
    }
}
