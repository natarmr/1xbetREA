package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d5a0 implements i5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f5497a;

    public d5a0(d280 d280Var) {
        this.f5497a = d280Var;
    }

    @Override // a.i5a0
    public final d280 a() {
        return this.f5497a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5a0) && this.f5497a.equals(((d5a0) obj).f5497a);
    }

    public final int hashCode() {
        return this.f5497a.hashCode();
    }

    public final String toString() {
        return "WithoutFavoriteIcon(playerIcon=" + this.f5497a + Separators.RPAREN;
    }
}
