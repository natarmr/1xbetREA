package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class muk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22416a;
    public final String b;
    public final String c;
    public final boolean d;

    public muk(String str, String str2, boolean z, boolean z2) {
        this.f22416a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muk)) {
            return false;
        }
        muk mukVar = (muk) obj;
        return this.f22416a == mukVar.f22416a && this.b.equals(mukVar.b) && this.c.equals(mukVar.c) && this.d == mukVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof muk) && (p6t0Var2 instanceof muk)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Boolean.hashCode(this.f22416a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", isLastItem=", Separators.RPAREN, axq.q("DisciplineUiModel(selected=", ", title=", this.b, this.f22416a, ", discipline="), this.d);
    }
}
