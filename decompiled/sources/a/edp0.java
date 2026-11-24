package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class edp0 implements fdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5a0 f7630a;

    public edp0(k5a0 k5a0Var) {
        this.f7630a = k5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edp0) && this.f7630a.equals(((edp0) obj).f7630a);
    }

    public final int hashCode() {
        return this.f7630a.hashCode();
    }

    public final String toString() {
        return "WithLogoOnly(playerLogo=" + this.f7630a + Separators.RPAREN;
    }
}
