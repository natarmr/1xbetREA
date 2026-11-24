package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class odp0 implements rdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5a0 f25087a;

    public odp0(d5a0 d5a0Var) {
        this.f25087a = d5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odp0) && this.f25087a.equals(((odp0) obj).f25087a);
    }

    public final int hashCode() {
        return this.f25087a.hashCode();
    }

    public final String toString() {
        return "WithLogoOnly(playerLogo=" + this.f25087a + Separators.RPAREN;
    }
}
