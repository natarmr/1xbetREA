package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kal implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4l f17969a;

    public final boolean equals(Object obj) {
        if (obj instanceof kal) {
            return this.f17969a.equals(((kal) obj).f17969a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17969a.hashCode();
    }

    public final String toString() {
        return "SecondTeam(value=" + this.f17969a + Separators.RPAREN;
    }
}
