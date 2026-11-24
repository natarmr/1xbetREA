package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43254a;

    public yu7(boolean z) {
        this.f43254a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu7) && this.f43254a == ((yu7) obj).f43254a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43254a);
    }

    public final String toString() {
        return defpackage.c.d("ShowLoading(show=", Separators.RPAREN, this.f43254a);
    }
}
