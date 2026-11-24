package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fyb extends hyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f10351a;

    /* JADX WARN: Multi-variable type inference failed */
    public fyb(int i) {
        this.f10351a = i;
    }

    @Override // a.hyb
    public final int a() {
        return this.f10351a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyb) && this.f10351a == ((fyb) obj).f10351a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10351a);
    }

    public final String toString() {
        return ua80.e(this.f10351a, "BothTeamsAreFull(teamId=", Separators.RPAREN);
    }
}
