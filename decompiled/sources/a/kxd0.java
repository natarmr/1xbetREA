package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxd0 implements nxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f19049a;

    public final boolean equals(Object obj) {
        if (obj instanceof kxd0) {
            return this.f19049a.equals(((kxd0) obj).f19049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19049a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f19049a + Separators.RPAREN;
    }
}
