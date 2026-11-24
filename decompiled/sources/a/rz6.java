package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31343a;

    public rz6(boolean z) {
        this.f31343a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz6) && this.f31343a == ((rz6) obj).f31343a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31343a);
    }

    public final String toString() {
        return defpackage.c.d("ShowChangeBalanceMessage(onlyPTS=", Separators.RPAREN, this.f31343a);
    }
}
