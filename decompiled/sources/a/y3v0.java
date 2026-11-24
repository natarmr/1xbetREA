package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y3v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41972a;

    public y3v0(boolean z) {
        this.f41972a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3v0) && this.f41972a == ((y3v0) obj).f41972a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41972a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f41972a);
    }
}
