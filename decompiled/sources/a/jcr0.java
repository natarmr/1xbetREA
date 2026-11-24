package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jcr0 implements kcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbr0 f16292a;
    public final a4x b;
    public final boolean c;

    public jcr0(kbr0 kbr0Var, a4x a4xVar, boolean z) {
        this.f16292a = kbr0Var;
        this.b = a4xVar;
        this.c = z;
    }

    @Override // a.kcr0
    public final boolean a() {
        return this.c;
    }

    @Override // a.kcr0
    public final kbr0 b() {
        return this.f16292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcr0)) {
            return false;
        }
        jcr0 jcr0Var = (jcr0) obj;
        return this.f16292a.equals(jcr0Var.f16292a) && this.b.equals(jcr0Var.b) && this.c == jcr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f16292a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f16292a);
        sb.append(", topPlayersCards=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
