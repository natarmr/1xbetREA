package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f5a0 implements k5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f8953a;

    public f5a0(d280 d280Var) {
        this.f8953a = d280Var;
    }

    @Override // a.k5a0
    public final d280 a() {
        return this.f8953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5a0) && this.f8953a.equals(((f5a0) obj).f8953a);
    }

    public final int hashCode() {
        return this.f8953a.hashCode();
    }

    public final String toString() {
        return "WithoutFavoriteIcon(playerIcon=" + this.f8953a + Separators.RPAREN;
    }
}
