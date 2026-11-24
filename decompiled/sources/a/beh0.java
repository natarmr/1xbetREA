package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class beh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2451a;

    public final boolean equals(Object obj) {
        if (obj instanceof beh0) {
            return Float.compare(this.f2451a, ((beh0) obj).f2451a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2451a);
    }

    public final String toString() {
        return rw2.j(this.f2451a, "PlayerTwoFieldOpacity(value=", Separators.RPAREN);
    }
}
