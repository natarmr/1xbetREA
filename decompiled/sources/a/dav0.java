package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5771a;

    public dav0(int i) {
        this.f5771a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dav0) && this.f5771a == ((dav0) obj).f5771a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5771a);
    }

    public final String toString() {
        return ua80.e(this.f5771a, "WheelMargins(wheelLeftMargin=", Separators.RPAREN);
    }
}
