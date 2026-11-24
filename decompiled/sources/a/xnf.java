package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqf f41168a;

    public final boolean equals(Object obj) {
        if (obj instanceof xnf) {
            return this.f41168a.equals(((xnf) obj).f41168a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41168a.hashCode();
    }

    public final String toString() {
        return "WeaponFirstPlayer(value=" + this.f41168a + Separators.RPAREN;
    }
}
