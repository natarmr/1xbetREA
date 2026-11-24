package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ws5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39675a;
    public final mvc b;

    public ws5(int i, mvc mvcVar) {
        this.f39675a = i;
        this.b = mvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5)) {
            return false;
        }
        ws5 ws5Var = (ws5) obj;
        return this.f39675a == ws5Var.f39675a && this.b == ws5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f39675a) * 31);
    }

    public final String toString() {
        return "BannerTypeContainer(typeId=" + this.f39675a + ", code=" + this.b + Separators.RPAREN;
    }
}
