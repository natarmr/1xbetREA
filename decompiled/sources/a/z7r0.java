package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z7r0 implements a8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43933a;

    public z7r0(int i) {
        this.f43933a = i;
    }

    @Override // a.a8r0
    public final int a() {
        return this.f43933a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7r0) && this.f43933a == ((z7r0) obj).f43933a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43933a);
    }

    public final String toString() {
        return ua80.e(this.f43933a, "Error(style=", Separators.RPAREN);
    }
}
