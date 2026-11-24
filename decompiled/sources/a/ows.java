package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ows implements pws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcs f25980a;

    public ows(jcs jcsVar) {
        this.f25980a = jcsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ows) && this.f25980a == ((ows) obj).f25980a;
    }

    public final int hashCode() {
        return this.f25980a.hashCode();
    }

    public final String toString() {
        return "WindowNavigate(onNavigateToWindow=" + this.f25980a + Separators.RPAREN;
    }
}
