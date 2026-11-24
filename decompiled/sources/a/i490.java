package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14136a;

    public i490(String str) {
        this.f14136a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i490) && this.f14136a.equals(((i490) obj).f14136a);
    }

    public final int hashCode() {
        return this.f14136a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPayCheck(url=", this.f14136a, Separators.RPAREN);
    }
}
