package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13991a;

    public i1c0(int i) {
        this.f13991a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1c0) && this.f13991a == ((i1c0) obj).f13991a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13991a);
    }

    public final String toString() {
        return ua80.e(this.f13991a, "ResidentStatusDialog(selectedResidentId=", Separators.RPAREN);
    }
}
