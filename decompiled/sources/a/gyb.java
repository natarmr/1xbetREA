package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gyb extends hyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12120a;

    /* JADX WARN: Multi-variable type inference failed */
    public gyb(int i) {
        this.f12120a = i;
    }

    @Override // a.hyb
    public final int a() {
        return this.f12120a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyb) && this.f12120a == ((gyb) obj).f12120a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12120a);
    }

    public final String toString() {
        return ua80.e(this.f12120a, "TeamIsFull(teamId=", Separators.RPAREN);
    }
}
