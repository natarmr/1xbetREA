package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w69 implements e79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38615a;

    public w69(int i) {
        this.f38615a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w69) && this.f38615a == ((w69) obj).f38615a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38615a);
    }

    public final String toString() {
        return ua80.e(this.f38615a, "OnZoneFormatChanged(mode=", Separators.RPAREN);
    }
}
