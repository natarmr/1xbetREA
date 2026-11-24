package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ojg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f25358a;
    public final String b;

    public ojg0(n0x n0xVar, String str) {
        this.f25358a = n0xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojg0)) {
            return false;
        }
        ojg0 ojg0Var = (ojg0) obj;
        return this.f25358a.equals(ojg0Var.f25358a) && this.b.equals(ojg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25358a.hashCode() * 31);
    }

    public final String toString() {
        return "RpsPlayerInfoState(image=" + this.f25358a + ", name=" + this.b + Separators.RPAREN;
    }
}
