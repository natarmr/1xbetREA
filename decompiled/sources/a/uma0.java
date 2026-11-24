package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uma0 implements vma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gma0 f35911a;
    public final f9m0 b;
    public final boolean c;

    public uma0(gma0 gma0Var, f9m0 f9m0Var, boolean z) {
        this.f35911a = gma0Var;
        this.b = f9m0Var;
        this.c = z;
    }

    @Override // a.vma0
    public final boolean a() {
        return this.c;
    }

    @Override // a.vma0
    public final gma0 b() {
        return this.f35911a;
    }

    @Override // a.vma0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uma0)) {
            return false;
        }
        uma0 uma0Var = (uma0) obj;
        return this.f35911a.equals(uma0Var.f35911a) && this.b.equals(uma0Var.b) && this.c == uma0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f35911a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f35911a);
        sb.append(", statisticAppBarUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
