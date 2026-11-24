package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ebg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7517a;

    public final boolean equals(Object obj) {
        if (obj instanceof ebg0) {
            return this.f7517a.equals(((ebg0) obj).f7517a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7517a.hashCode();
    }

    public final String toString() {
        return kng0.l("RewardSystemLoginModel(sessionId=", this.f7517a, Separators.RPAREN);
    }
}
