package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zo6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44704a;

    public zo6(String str) {
        this.f44704a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo6) && this.f44704a.equals(((zo6) obj).f44704a);
    }

    public final int hashCode() {
        return this.f44704a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsDialog(message=", this.f44704a, Separators.RPAREN);
    }
}
