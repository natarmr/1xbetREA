package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class egg0 implements ggg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cgg0 f7764a;
    public final agg0 b;

    public egg0(cgg0 cgg0Var, agg0 agg0Var) {
        this.f7764a = cgg0Var;
        this.b = agg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egg0)) {
            return false;
        }
        egg0 egg0Var = (egg0) obj;
        return this.f7764a == egg0Var.f7764a && this.b == egg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7764a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(imageType=" + this.f7764a + ", itemColorType=" + this.b + Separators.RPAREN;
    }
}
