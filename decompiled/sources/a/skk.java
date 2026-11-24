package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class skk implements wkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gkk f32353a;

    public final boolean equals(Object obj) {
        if (obj instanceof skk) {
            return this.f32353a.equals(((skk) obj).f32353a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32353a.hashCode();
    }

    public final String toString() {
        return "MatchResult(value=" + this.f32353a + Separators.RPAREN;
    }
}
