package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pd30 implements rd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd30 f26788a;
    public final boolean b;
    public final boolean c;

    public pd30(bd30 bd30Var, boolean z, boolean z2) {
        this.f26788a = bd30Var;
        this.b = z;
        this.c = z2;
    }

    @Override // a.rd30
    public final boolean a() {
        return this.b;
    }

    @Override // a.rd30
    public final bd30 b() {
        return this.f26788a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd30)) {
            return false;
        }
        pd30 pd30Var = (pd30) obj;
        return this.f26788a.equals(pd30Var.f26788a) && this.b == pd30Var.b && this.c == pd30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f26788a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f26788a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", isShortStatistic=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
