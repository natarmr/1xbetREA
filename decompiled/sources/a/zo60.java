package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zo60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44705a;

    public zo60(boolean z) {
        this.f44705a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo60) && this.f44705a == ((zo60) obj).f44705a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44705a);
    }

    public final String toString() {
        return defpackage.c.d("OnBalanceShowed(isHidden=", Separators.RPAREN, this.f44705a);
    }
}
