package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f24580a;

    public o3e0(ufp0 ufp0Var) {
        this.f24580a = ufp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3e0) && this.f24580a.equals(((o3e0) obj).f24580a);
    }

    public final int hashCode() {
        return this.f24580a.hashCode();
    }

    public final String toString() {
        return "TeamCell(teamModel=" + this.f24580a + Separators.RPAREN;
    }
}
