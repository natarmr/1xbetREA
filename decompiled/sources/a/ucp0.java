package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ucp0 implements wcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5a0 f35441a;
    public final c5a0 b;

    public ucp0(c5a0 c5a0Var, c5a0 c5a0Var2) {
        this.f35441a = c5a0Var;
        this.b = c5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucp0)) {
            return false;
        }
        ucp0 ucp0Var = (ucp0) obj;
        return this.f35441a.equals(ucp0Var.f35441a) && this.b.equals(ucp0Var.b);
    }

    public final int hashCode() {
        return this.b.f3761a.hashCode() + (this.f35441a.f3761a.hashCode() * 31);
    }

    public final String toString() {
        return "WithLogoOnlyHorizontal(firstPlayerLogo=" + this.f35441a + ", secondPlayerLogo=" + this.b + Separators.RPAREN;
    }
}
