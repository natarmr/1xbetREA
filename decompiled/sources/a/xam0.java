package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xam0 extends ufx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivw f40564a;

    public xam0(ivw ivwVar) {
        this.f40564a = ivwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xam0) && this.f40564a.equals(((xam0) obj).f40564a);
    }

    public final int hashCode() {
        return this.f40564a.hashCode();
    }

    public final String toString() {
        return "Success(successData=" + this.f40564a + Separators.RPAREN;
    }
}
