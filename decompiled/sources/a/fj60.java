package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9622a;

    public final boolean equals(Object obj) {
        if (obj instanceof fj60) {
            return this.f9622a == ((fj60) obj).f9622a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9622a);
    }

    public final String toString() {
        return ua80.e(this.f9622a, "ShowTipsDialog(sectionTypeId=", Separators.RPAREN);
    }
}
