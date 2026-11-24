package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xh70 extends zh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40875a;

    public xh70(boolean z) {
        this.f40875a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh70) && this.f40875a == ((xh70) obj).f40875a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40875a);
    }

    public final String toString() {
        return defpackage.c.d("ShowInstantBet(enable=", Separators.RPAREN, this.f40875a);
    }
}
