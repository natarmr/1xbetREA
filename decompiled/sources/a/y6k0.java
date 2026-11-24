package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y6k0 implements a7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42102a;

    public y6k0(boolean z) {
        this.f42102a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6k0) && this.f42102a == ((y6k0) obj).f42102a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42102a);
    }

    public final String toString() {
        return defpackage.c.d("Failed(isTimeout=", Separators.RPAREN, this.f42102a);
    }
}
