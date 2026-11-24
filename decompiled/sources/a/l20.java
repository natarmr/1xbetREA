package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f19284a;
    public final i10 b;
    public final boolean c;

    public l20(imm immVar, i10 i10Var, boolean z) {
        this.f19284a = immVar;
        this.b = i10Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return this.f19284a.equals(l20Var.f19284a) && this.b.equals(l20Var.b) && this.c == l20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f19284a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalVerificationStatusUiState(navigationBarModel=");
        sb.append(this.f19284a);
        sb.append(", contentUiState=");
        sb.append(this.b);
        sb.append(", toolbarVisible=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
