package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ex70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f8564a;

    public ex70(zpv zpvVar) {
        this.f8564a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f8564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex70) && this.f8564a.equals(((ex70) obj).f8564a);
    }

    public final int hashCode() {
        return this.f8564a.hashCode();
    }

    public final String toString() {
        return "SportEvents(headerActionsState=" + this.f8564a + Separators.RPAREN;
    }
}
