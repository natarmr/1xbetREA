package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class asn0 implements fsn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpn0 f1399a;

    public asn0(bpn0 bpn0Var) {
        bpn0Var.getClass();
        this.f1399a = bpn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asn0) && this.f1399a == ((asn0) obj).f1399a;
    }

    public final int hashCode() {
        return this.f1399a.hashCode();
    }

    public final String toString() {
        return "OnLogSwipeLeft(type=" + this.f1399a + Separators.RPAREN;
    }
}
