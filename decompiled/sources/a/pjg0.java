package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pjg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27089a;
    public final n0x b;
    public final String c;

    public pjg0(int i, n0x n0xVar, String str) {
        this.f27089a = i;
        this.b = n0xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjg0)) {
            return false;
        }
        pjg0 pjg0Var = (pjg0) obj;
        return this.f27089a == pjg0Var.f27089a && this.b.equals(pjg0Var.b) && this.c.equals(pjg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, Integer.hashCode(this.f27089a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RpsPlayerInfoUiModel(id=");
        sb.append(this.f27089a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", name=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
