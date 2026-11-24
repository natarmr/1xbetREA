package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gbu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f11030a;
    public final bau0 b;
    public final boolean c;

    public gbu0(imm immVar, bau0 bau0Var, boolean z) {
        this.f11030a = immVar;
        this.b = bau0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbu0)) {
            return false;
        }
        gbu0 gbu0Var = (gbu0) obj;
        return this.f11030a.equals(gbu0Var.f11030a) && this.b.equals(gbu0Var.b) && this.c == gbu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f11030a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationStatusUiState(navigationBarModel=");
        sb.append(this.f11030a);
        sb.append(", contentUiState=");
        sb.append(this.b);
        sb.append(", toolbarVisible=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
