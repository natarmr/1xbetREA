package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pol0 implements vol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f27335a;

    public final boolean equals(Object obj) {
        if (obj instanceof pol0) {
            return this.f27335a.equals(((pol0) obj).f27335a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27335a.hashCode();
    }

    public final String toString() {
        return vqd.m("GameCard(delegateAction=", this.f27335a, Separators.RPAREN);
    }
}
