package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26651a;
    public final boolean b;

    public pad0(int i, boolean z) {
        this.f26651a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pad0)) {
            return false;
        }
        pad0 pad0Var = (pad0) obj;
        return this.f26651a == pad0Var.f26651a && this.b == pad0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f26651a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f26651a, "CyberTopChamps(cyberType=", ", live=", Separators.RPAREN, this.b);
    }
}
