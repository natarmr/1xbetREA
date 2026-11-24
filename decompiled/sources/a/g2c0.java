package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g2c0 implements k2c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10553a;

    public g2c0(boolean z) {
        this.f10553a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2c0) && this.f10553a == ((g2c0) obj).f10553a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10553a);
    }

    public final String toString() {
        return defpackage.c.d("SetLoading(loading=", Separators.RPAREN, this.f10553a);
    }
}
