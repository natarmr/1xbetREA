package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dx70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f6834a;

    public dx70(zpv zpvVar) {
        this.f6834a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f6834a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx70) && this.f6834a.equals(((dx70) obj).f6834a);
    }

    public final int hashCode() {
        return this.f6834a.hashCode();
    }

    public final String toString() {
        return "OnexGames(headerActionsState=" + this.f6834a + Separators.RPAREN;
    }
}
