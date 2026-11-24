package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5x f36847a;

    public final boolean equals(Object obj) {
        if (obj instanceof v5x) {
            return this.f36847a.equals(((v5x) obj).f36847a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36847a.hashCode();
    }

    public final String toString() {
        return "SecondPlayerCombination(value=" + this.f36847a + Separators.RPAREN;
    }
}
