package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk90 f44315a;

    public zft(nk90 nk90Var) {
        this.f44315a = nk90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zft) && this.f44315a.equals(((zft) obj).f44315a);
    }

    public final int hashCode() {
        return this.f44315a.hashCode();
    }

    public final String toString() {
        return "ExitWithResult(genderChoice=" + this.f44315a + Separators.RPAREN;
    }
}
