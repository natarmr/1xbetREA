package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lbg0 implements obg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19753a;

    public lbg0(boolean z) {
        this.f19753a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbg0) && this.f19753a == ((lbg0) obj).f19753a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19753a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f19753a);
    }
}
