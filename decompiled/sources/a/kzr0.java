package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kzr0 implements mzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19165a;
    public final String b;

    public kzr0(String str, String str2) {
        nzr0 nzr0Var = nzr0.f24387a;
        this.f19165a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzr0)) {
            return false;
        }
        kzr0 kzr0Var = (kzr0) obj;
        nzr0 nzr0Var = nzr0.f24387a;
        return this.f19165a.equals(kzr0Var.f19165a) && this.b.equals(kzr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(nzr0.b.hashCode() * 31, 31, this.f19165a);
    }

    public final String toString() {
        nzr0 nzr0Var = nzr0.b;
        StringBuilder sb = new StringBuilder("ImageWithTitle(cellType=");
        sb.append(nzr0Var);
        sb.append(", image=");
        sb.append(this.f19165a);
        sb.append(", title=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
