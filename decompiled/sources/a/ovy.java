package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ovy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f25947a;
    public final n0x b;

    public ovy(n0x n0xVar, n0x n0xVar2) {
        this.f25947a = n0xVar;
        this.b = n0xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovy)) {
            return false;
        }
        ovy ovyVar = (ovy) obj;
        return this.f25947a.equals(ovyVar.f25947a) && this.b.equals(ovyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25947a.hashCode() * 31);
    }

    public final String toString() {
        return "PictureChanged(value=" + this.f25947a + ", fallback=" + this.b + Separators.RPAREN;
    }
}
