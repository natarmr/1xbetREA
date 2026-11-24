package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bg2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2534a;

    public final boolean equals(Object obj) {
        if (obj instanceof bg2) {
            return this.f2534a == ((bg2) obj).f2534a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2534a);
    }

    public final String toString() {
        return ua80.e(this.f2534a, "OnRightButtonClick(index=", Separators.RPAREN);
    }
}
