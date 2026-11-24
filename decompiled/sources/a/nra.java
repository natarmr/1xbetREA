package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nra implements qra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23991a;

    public nra(int i) {
        this.f23991a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nra) && this.f23991a == ((nra) obj).f23991a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23991a);
    }

    public final String toString() {
        return ua80.e(this.f23991a, "OnRightButtonClick(index=", Separators.RPAREN);
    }
}
