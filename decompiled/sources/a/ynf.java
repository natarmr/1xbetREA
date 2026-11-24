package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ynf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqf f42938a;

    public final boolean equals(Object obj) {
        if (obj instanceof ynf) {
            return this.f42938a.equals(((ynf) obj).f42938a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42938a.hashCode();
    }

    public final String toString() {
        return "WeaponFivePlayer(value=" + this.f42938a + Separators.RPAREN;
    }
}
