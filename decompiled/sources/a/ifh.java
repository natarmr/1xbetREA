package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ifh implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14686a;

    public /* synthetic */ ifh(String str) {
        this.f14686a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ifh) {
            return this.f14686a.equals(((ifh) obj).f14686a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14686a.hashCode();
    }

    public final String toString() {
        return kng0.l("Number(value=", this.f14686a, Separators.RPAREN);
    }
}
