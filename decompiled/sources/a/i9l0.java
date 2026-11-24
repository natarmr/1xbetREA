package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i9l0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gga f14393a;
    public final v12 b;
    public final String c;

    public i9l0(gga ggaVar, v12 v12Var) {
        this.f14393a = ggaVar;
        this.b = v12Var;
        this.c = ggaVar.getKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9l0)) {
            return false;
        }
        i9l0 i9l0Var = (i9l0) obj;
        return this.f14393a.equals(i9l0Var.f14393a) && this.b == i9l0Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14393a.hashCode() * 31);
    }

    public final String toString() {
        return "SportFinalGameEventCardUiModel(cardFinalGame=" + this.f14393a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
