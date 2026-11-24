package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r4o implements s4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f29845a;

    public final boolean equals(Object obj) {
        if (obj instanceof r4o) {
            return this.f29845a.equals(((r4o) obj).f29845a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29845a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f29845a + Separators.RPAREN;
    }
}
