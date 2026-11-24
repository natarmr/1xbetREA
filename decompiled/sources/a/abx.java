package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class abx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f600a;

    public abx(boolean z) {
        this.f600a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abx) && this.f600a == ((abx) obj).f600a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f600a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f600a);
    }
}
