package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20464a;
    public final zo0 b;
    public final jjm c;
    public final kjm d;

    public lq0(String str, zo0 zo0Var, jjm jjmVar, kjm kjmVar) {
        this.f20464a = str;
        this.b = zo0Var;
        this.c = jjmVar;
        this.d = kjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq0)) {
            return false;
        }
        lq0 lq0Var = (lq0) obj;
        return this.f20464a.equals(lq0Var.f20464a) && this.b.equals(lq0Var.b) && this.c.equals(lq0Var.c) && this.d == lq0Var.d;
    }

    @Override // a.rq0
    public final String getId() {
        return this.f20464a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20464a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Header(id=" + this.f20464a + ", position=" + this.b + ", dsHeaderUiModel=" + this.c + ", dsHeaderSizeType=" + this.d + Separators.RPAREN;
    }
}
