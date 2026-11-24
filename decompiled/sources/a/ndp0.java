package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ndp0 implements qdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5a0 f23347a;

    public ndp0(c5a0 c5a0Var) {
        this.f23347a = c5a0Var;
    }

    @Override // a.qdp0
    public final h5a0 a() {
        return this.f23347a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndp0) && this.f23347a.equals(((ndp0) obj).f23347a);
    }

    public final int hashCode() {
        return this.f23347a.hashCode();
    }

    public final String toString() {
        return "WithLogoOnly(playerLogo=" + this.f23347a + Separators.RPAREN;
    }
}
