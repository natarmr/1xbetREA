package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aof implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqf f1198a;

    public final boolean equals(Object obj) {
        if (obj instanceof aof) {
            return this.f1198a.equals(((aof) obj).f1198a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1198a.hashCode();
    }

    public final String toString() {
        return "WeaponSecondPlayer(value=" + this.f1198a + Separators.RPAREN;
    }
}
