package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aoy implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1224a;

    public /* synthetic */ aoy(String str) {
        this.f1224a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aoy) {
            return this.f1224a.equals(((aoy) obj).f1224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1224a.hashCode();
    }

    public final String toString() {
        return kng0.l("NumberOfKills(value=", this.f1224a, Separators.RPAREN);
    }
}
