package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s2l implements u2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31506a;
    public final boolean b;

    public s2l(int i, boolean z) {
        this.f31506a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2l)) {
            return false;
        }
        s2l s2lVar = (s2l) obj;
        return this.f31506a == s2lVar.f31506a && this.b == s2lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f31506a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f31506a, "ScrollPosition(scroll=", ", needScroll=", Separators.RPAREN, this.b);
    }
}
