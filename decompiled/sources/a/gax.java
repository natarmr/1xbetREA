package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf30 f10990a;

    public gax(sf30 sf30Var) {
        dja djaVar = dja.PENALTY;
        this.f10990a = sf30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gax)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return this.f10990a.equals(((gax) obj).f10990a);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.LIVE_EVENTS;
    }

    public final int hashCode() {
        return this.f10990a.f32099a.hashCode() + (dja.LIVE_EVENTS.hashCode() * 31);
    }

    public final String toString() {
        return "MatchReview(type=" + dja.LIVE_EVENTS + ", info=" + this.f10990a + Separators.RPAREN;
    }
}
