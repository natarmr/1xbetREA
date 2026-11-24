package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xdh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40692a;

    public final boolean equals(Object obj) {
        if (obj instanceof xdh0) {
            return Float.compare(this.f40692a, ((xdh0) obj).f40692a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40692a);
    }

    public final String toString() {
        return rw2.j(this.f40692a, "PlayerOneOpacity(value=", Separators.RPAREN);
    }
}
