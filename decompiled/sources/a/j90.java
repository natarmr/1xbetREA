package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class j90 extends l90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16113a;

    public j90(boolean z) {
        this.f16113a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && this.f16113a == ((j90) obj).f16113a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16113a);
    }

    public final String toString() {
        return defpackage.c.d("ShowRoulette(show=", Separators.RPAREN, this.f16113a);
    }
}
