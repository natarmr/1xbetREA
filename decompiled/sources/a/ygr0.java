package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ygr0 implements ghr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42599a;

    public ygr0(boolean z) {
        this.f42599a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygr0) && this.f42599a == ((ygr0) obj).f42599a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42599a);
    }

    public final String toString() {
        return defpackage.c.d("OnMakeBetLoaderVisibilityChanged(show=", Separators.RPAREN, this.f42599a);
    }
}
