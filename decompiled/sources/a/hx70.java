package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hx70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f13802a;

    public hx70(zpv zpvVar) {
        this.f13802a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f13802a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx70) && this.f13802a.equals(((hx70) obj).f13802a);
    }

    public final int hashCode() {
        return this.f13802a.hashCode();
    }

    public final String toString() {
        return "SportTracked(headerActionsState=" + this.f13802a + Separators.RPAREN;
    }
}
