package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43672a;

    public final boolean equals(Object obj) {
        if (obj instanceof z2j0) {
            return this.f43672a == ((z2j0) obj).f43672a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43672a);
    }

    public final String toString() {
        return defpackage.c.d("VipBet(hasEnable=", Separators.RPAREN, this.f43672a);
    }
}
