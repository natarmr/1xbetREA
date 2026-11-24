package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rph0 implements sph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30887a;

    public rph0(int i) {
        this.f30887a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rph0) && this.f30887a == ((rph0) obj).f30887a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30887a);
    }

    public final String toString() {
        return ua80.e(this.f30887a, "OnTabSelected(currentTab=", Separators.RPAREN);
    }
}
