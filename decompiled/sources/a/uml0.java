package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jzm f35923a;

    public uml0(jzm jzmVar) {
        this.f35923a = jzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uml0) && this.f35923a.equals(((uml0) obj).f35923a);
    }

    public final int hashCode() {
        return this.f35923a.hashCode();
    }

    public final String toString() {
        return "MultiTeams(model=" + this.f35923a + Separators.RPAREN;
    }
}
