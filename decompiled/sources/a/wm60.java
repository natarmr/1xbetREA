package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wm60 implements en60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn60 f39389a;

    public wm60(zn60 zn60Var) {
        this.f39389a = zn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm60) && this.f39389a == ((wm60) obj).f39389a;
    }

    public final int hashCode() {
        return this.f39389a.hashCode();
    }

    public final String toString() {
        return "Initialize(screen=" + this.f39389a + Separators.RPAREN;
    }
}
