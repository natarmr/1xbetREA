package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l0t implements m0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcs f19218a;

    public l0t(jcs jcsVar) {
        this.f19218a = jcsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0t) && this.f19218a == ((l0t) obj).f19218a;
    }

    public final int hashCode() {
        return this.f19218a.hashCode();
    }

    public final String toString() {
        return "WindowNavigate(onNavigateToWindow=" + this.f19218a + Separators.RPAREN;
    }
}
