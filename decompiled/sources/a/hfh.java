package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hfh implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12973a;

    public /* synthetic */ hfh(String str) {
        this.f12973a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hfh) {
            return this.f12973a.equals(((hfh) obj).f12973a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12973a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f12973a, Separators.RPAREN);
    }
}
