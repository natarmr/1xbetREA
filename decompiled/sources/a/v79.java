package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v79 implements w79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb8 f36913a;

    public v79(vb8 vb8Var) {
        this.f36913a = vb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v79) && this.f36913a == ((v79) obj).f36913a;
    }

    public final int hashCode() {
        return this.f36913a.hashCode();
    }

    public final String toString() {
        return "WindowNavigate(onNavigateToWindow=" + this.f36913a + Separators.RPAREN;
    }
}
