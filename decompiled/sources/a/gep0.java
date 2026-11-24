package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gep0 implements hep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11168a;

    public gep0(boolean z) {
        this.f11168a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gep0) && this.f11168a == ((gep0) obj).f11168a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11168a);
    }

    public final String toString() {
        return defpackage.c.d("Statistic(enable=", Separators.RPAREN, this.f11168a);
    }
}
