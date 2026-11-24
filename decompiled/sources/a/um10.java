package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class um10 implements ym10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35899a;

    public um10(boolean z) {
        this.f35899a = z;
    }

    @Override // a.ym10
    public final boolean a() {
        return this.f35899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um10) && this.f35899a == ((um10) obj).f35899a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35899a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(networkAvailable=", Separators.RPAREN, this.f35899a);
    }
}
