package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m5a0 implements o5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8a0 f21211a;

    public final boolean equals(Object obj) {
        if (obj instanceof m5a0) {
            return this.f21211a.equals(((m5a0) obj).f21211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21211a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f21211a + Separators.RPAREN;
    }
}
