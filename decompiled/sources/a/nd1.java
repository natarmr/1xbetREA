package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23319a;

    public nd1(int i) {
        this.f23319a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd1) && this.f23319a == ((nd1) obj).f23319a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23319a);
    }

    public final String toString() {
        return ua80.e(this.f23319a, "OnSaveSeenBanner(bannerId=", Separators.RPAREN);
    }
}
