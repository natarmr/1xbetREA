package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v0i0 implements w0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36582a;

    public v0i0(boolean z) {
        this.f36582a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0i0) && this.f36582a == ((v0i0) obj).f36582a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36582a);
    }

    public final String toString() {
        return defpackage.c.d("NoData(loading=", Separators.RPAREN, this.f36582a);
    }
}
