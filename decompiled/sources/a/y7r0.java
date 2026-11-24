package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y7r0 implements a8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42167a;

    public y7r0(int i) {
        this.f42167a = i;
    }

    @Override // a.a8r0
    public final int a() {
        return this.f42167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7r0) && this.f42167a == ((y7r0) obj).f42167a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42167a);
    }

    public final String toString() {
        return ua80.e(this.f42167a, "Empty(style=", Separators.RPAREN);
    }
}
