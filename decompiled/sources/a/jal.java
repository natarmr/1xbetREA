package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jal implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4l f16195a;

    public final boolean equals(Object obj) {
        if (obj instanceof jal) {
            return this.f16195a.equals(((jal) obj).f16195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16195a.hashCode();
    }

    public final String toString() {
        return "FirstTeam(value=" + this.f16195a + Separators.RPAREN;
    }
}
