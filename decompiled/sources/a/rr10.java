package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rr10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30959a;

    public rr10(int i) {
        this.f30959a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr10) && this.f30959a == ((rr10) obj).f30959a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30959a);
    }

    public final String toString() {
        return ua80.e(this.f30959a, "MainCallBackState(selectedTabPosition=", Separators.RPAREN);
    }
}
