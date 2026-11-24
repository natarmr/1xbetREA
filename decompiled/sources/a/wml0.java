package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jzm f39413a;

    public wml0(jzm jzmVar) {
        this.f39413a = jzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wml0) && this.f39413a.equals(((wml0) obj).f39413a);
    }

    public final int hashCode() {
        return this.f39413a.hashCode();
    }

    public final String toString() {
        return "Tennis(model=" + this.f39413a + Separators.RPAREN;
    }
}
