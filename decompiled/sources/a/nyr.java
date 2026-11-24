package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nyr implements ryr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24342a;

    public final boolean equals(Object obj) {
        if (obj instanceof nyr) {
            return this.f24342a == ((nyr) obj).f24342a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24342a);
    }

    public final String toString() {
        return defpackage.c.d("BetGroup(value=", Separators.RPAREN, this.f24342a);
    }
}
