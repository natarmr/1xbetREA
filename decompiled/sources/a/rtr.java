package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rtr implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31089a;

    public final boolean equals(Object obj) {
        if (obj instanceof rtr) {
            return this.f31089a == ((rtr) obj).f31089a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31089a);
    }

    public final String toString() {
        return defpackage.c.d("FavoriteSelected(value=", Separators.RPAREN, this.f31089a);
    }
}
