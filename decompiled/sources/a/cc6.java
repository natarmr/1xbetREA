package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cc6 implements ec6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4093a;

    public cc6(int i) {
        this.f4093a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc6) && this.f4093a == ((cc6) obj).f4093a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4093a);
    }

    public final String toString() {
        return ua80.e(this.f4093a, "Picture(picture=", Separators.RPAREN);
    }
}
