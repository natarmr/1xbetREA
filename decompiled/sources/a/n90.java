package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23115a;

    public n90(int i) {
        this.f23115a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n90) && this.f23115a == ((n90) obj).f23115a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23115a);
    }

    public final String toString() {
        return ua80.e(this.f23115a, "WheelMargins(wheelLeftMargin=", Separators.RPAREN);
    }
}
