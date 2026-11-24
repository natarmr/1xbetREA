package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23612a;

    public nj0(boolean z) {
        y1p y1pVar = y1p.MAIN;
        this.f23612a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj0) || this.f23612a != ((nj0) obj).f23612a) {
            return false;
        }
        y1p y1pVar = y1p.MAIN;
        return true;
    }

    public final int hashCode() {
        return y1p.POPULAR_NEW_TOP.hashCode() + (Boolean.hashCode(this.f23612a) * 31);
    }

    public final String toString() {
        return "Initialize(isBrandsFullInfo=" + this.f23612a + ", type=" + y1p.POPULAR_NEW_TOP + Separators.RPAREN;
    }
}
