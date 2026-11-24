package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e5a0 implements j5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f7225a;

    public e5a0(d280 d280Var) {
        this.f7225a = d280Var;
    }

    @Override // a.j5a0
    public final d280 a() {
        return this.f7225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5a0) && this.f7225a.equals(((e5a0) obj).f7225a);
    }

    public final int hashCode() {
        return this.f7225a.hashCode();
    }

    public final String toString() {
        return "WithoutFavoriteIcon(playerIcon=" + this.f7225a + Separators.RPAREN;
    }
}
