package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8154a;

    public final boolean equals(Object obj) {
        if (obj instanceof eov) {
            return this.f8154a == ((eov) obj).f8154a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8154a);
    }

    public final String toString() {
        return ua80.e(this.f8154a, "Background(value=", Separators.RPAREN);
    }
}
