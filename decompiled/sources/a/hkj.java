package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hkj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f13211a;
    public final boolean b;

    public hkj(dyw dywVar, boolean z) {
        this.f13211a = dywVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkj)) {
            return false;
        }
        hkj hkjVar = (hkj) obj;
        return this.f13211a.equals(hkjVar.f13211a) && this.b == hkjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13211a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.f13211a + ", isSampled=" + this.b + Separators.RPAREN;
    }
}
