package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pfd0 implements xfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26898a;

    public pfd0(boolean z) {
        this.f26898a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfd0) && this.f26898a == ((pfd0) obj).f26898a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26898a);
    }

    public final String toString() {
        return defpackage.c.d("SetLoading(loading=", Separators.RPAREN, this.f26898a);
    }
}
