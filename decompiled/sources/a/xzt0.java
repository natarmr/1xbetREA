package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xzt0 implements a0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f41771a;

    public final boolean equals(Object obj) {
        if (obj instanceof xzt0) {
            return this.f41771a.equals(((xzt0) obj).f41771a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41771a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f41771a + Separators.RPAREN;
    }
}
