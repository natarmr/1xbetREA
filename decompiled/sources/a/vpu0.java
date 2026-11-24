package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vpu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37825a;
    public final long b;
    public final h5n c;

    public vpu0(String str, long j, h5n h5nVar) {
        this.f37825a = str;
        this.b = j;
        this.c = h5nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpu0)) {
            return false;
        }
        vpu0 vpu0Var = (vpu0) obj;
        return this.f37825a.equals(vpu0Var.f37825a) && this.b == vpu0Var.b && this.c.equals(vpu0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f37825a;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f37825a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "VirtualGameCategoryMainSubHeaderUiModel(key=", this.f37825a, ", sportId=");
        sbO.append(", subHeaderModel=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
