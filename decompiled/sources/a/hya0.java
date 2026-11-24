package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hya0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13851a;

    public hya0(int i) {
        this.f13851a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hya0) && this.f13851a == ((hya0) obj).f13851a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13851a);
    }

    public final String toString() {
        return ua80.e(this.f13851a, "TabSwitch(position=", Separators.RPAREN);
    }
}
