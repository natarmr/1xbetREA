package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cx70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f5111a;

    public cx70(zpv zpvVar) {
        this.f5111a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f5111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx70) && this.f5111a.equals(((cx70) obj).f5111a);
    }

    public final int hashCode() {
        return this.f5111a.hashCode();
    }

    public final String toString() {
        return "Aggregator(headerActionsState=" + this.f5111a + Separators.RPAREN;
    }
}
