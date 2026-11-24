package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kj7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18373a;

    public final boolean equals(Object obj) {
        if (obj instanceof kj7) {
            return this.f18373a.equals(((kj7) obj).f18373a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18373a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSubscribeActivate(screenName=", this.f18373a, Separators.RPAREN);
    }
}
