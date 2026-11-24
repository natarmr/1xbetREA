package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30871a;

    public rp60(String str) {
        this.f30871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp60) && this.f30871a.equals(((rp60) obj).f30871a);
    }

    public final int hashCode() {
        return this.f30871a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(searchString=", this.f30871a, Separators.RPAREN);
    }
}
