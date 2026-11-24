package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18585a;

    public final boolean equals(Object obj) {
        if (obj instanceof kng) {
            return this.f18585a.equals(((kng) obj).f18585a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18585a.hashCode();
    }

    public final String toString() {
        return kng0.l("CountReboundTitle(value=", this.f18585a, Separators.RPAREN);
    }
}
