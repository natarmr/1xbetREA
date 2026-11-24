package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1856a;

    public final boolean equals(Object obj) {
        if (obj instanceof b2l) {
            return this.f1856a == ((b2l) obj).f1856a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1856a);
    }

    public final String toString() {
        return defpackage.c.d("TeamDarkBan(value=", Separators.RPAREN, this.f1856a);
    }
}
