package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ois implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf50 f25326a;

    public final boolean equals(Object obj) {
        if (obj instanceof ois) {
            return this.f25326a == ((ois) obj).f25326a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25326a.hashCode();
    }

    public final String toString() {
        return "NavigationBarItemClick(type=" + this.f25326a + Separators.RPAREN;
    }
}
