package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39288a;

    public wk2(boolean z) {
        this.f39288a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk2) && this.f39288a == ((wk2) obj).f39288a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39288a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateCanScrollUpState(canScrollUp=", Separators.RPAREN, this.f39288a);
    }
}
