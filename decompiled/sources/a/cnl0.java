package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cnl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final izm f4662a;

    public cnl0(izm izmVar) {
        this.f4662a = izmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnl0) && this.f4662a.equals(((cnl0) obj).f4662a);
    }

    public final int hashCode() {
        return this.f4662a.hashCode();
    }

    public final String toString() {
        return "MultiTeams(model=" + this.f4662a + Separators.RPAREN;
    }
}
