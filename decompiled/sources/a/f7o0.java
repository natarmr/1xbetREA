package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f7o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9068a;
    public final x0g0 b;
    public final boolean c;

    public f7o0(String str, x0g0 x0g0Var, boolean z) {
        this.f9068a = str;
        this.b = x0g0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7o0)) {
            return false;
        }
        f7o0 f7o0Var = (f7o0) obj;
        return this.f9068a.equals(f7o0Var.f9068a) && this.b.equals(f7o0Var.b) && this.c == f7o0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f9068a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f9068a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyntheticResultsResultCardUiModel(key=");
        sb.append(this.f9068a);
        sb.append(", gameCardUiModel=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
