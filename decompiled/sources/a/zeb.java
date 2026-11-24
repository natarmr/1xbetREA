package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zeb implements afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f44242a;

    /* JADX WARN: Multi-variable type inference failed */
    public zeb(int i) {
        this.f44242a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zeb) && this.f44242a == ((zeb) obj).f44242a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44242a);
    }

    public final String toString() {
        return ua80.e(this.f44242a, "Shimmers(count=", Separators.RPAREN);
    }
}
