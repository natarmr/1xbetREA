package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class de30 implements fe30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg30 f5928a;

    @Override // a.fe30
    public final zg30 a() {
        return this.f5928a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof de30) {
            return this.f5928a.equals(((de30) obj).f5928a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5928a.hashCode();
    }

    public final String toString() {
        return "NoScore(winner=" + this.f5928a + Separators.RPAREN;
    }
}
