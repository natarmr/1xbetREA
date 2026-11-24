package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class b30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1879a;

    public b30(String str) {
        this.f1879a = str;
    }

    @Override // a.w30
    public final String a() {
        return this.f1879a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b30) && this.f1879a.equals(((b30) obj).f1879a);
    }

    public final int hashCode() {
        return this.f1879a.hashCode();
    }

    public final String toString() {
        return kng0.l("Animated(advanceTitle=", this.f1879a, Separators.RPAREN);
    }
}
