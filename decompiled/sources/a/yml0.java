package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jzm f42896a;

    public yml0(jzm jzmVar) {
        this.f42896a = jzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yml0) && this.f42896a.equals(((yml0) obj).f42896a);
    }

    public final int hashCode() {
        return this.f42896a.hashCode();
    }

    public final String toString() {
        return "TwoPairs(model=" + this.f42896a + Separators.RPAREN;
    }
}
