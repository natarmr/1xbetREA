package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12058a;

    public gx30(String str) {
        this.f12058a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx30) && this.f12058a.equals(((gx30) obj).f12058a);
    }

    public final int hashCode() {
        return this.f12058a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDeleteOrder(betId=", this.f12058a, Separators.RPAREN);
    }
}
