package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pb20 implements yc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm5 f26685a;

    public pb20(bm5 bm5Var) {
        bm5Var.getClass();
        this.f26685a = bm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb20) && this.f26685a == ((pb20) obj).f26685a;
    }

    public final int hashCode() {
        return this.f26685a.hashCode();
    }

    public final String toString() {
        return "NavigateToSelectWallet(balanceScreenType=" + this.f26685a + Separators.RPAREN;
    }
}
