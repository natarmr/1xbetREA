package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rbj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30190a;

    public rbj0(boolean z) {
        this.f30190a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbj0) && this.f30190a == ((rbj0) obj).f30190a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30190a);
    }

    public final String toString() {
        return defpackage.c.d("CheckCashSize(canClear=", Separators.RPAREN, this.f30190a);
    }
}
