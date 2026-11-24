package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jtl f8989a;

    public f62(jtl jtlVar) {
        this.f8989a = jtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f62) && this.f8989a.equals(((f62) obj).f8989a);
    }

    public final int hashCode() {
        return this.f8989a.hashCode();
    }

    public final String toString() {
        return "OnBottomBarClick(type=" + this.f8989a + Separators.RPAREN;
    }
}
