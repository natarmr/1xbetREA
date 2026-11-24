package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo7 f15490a;
    public final boolean b;
    public final boolean c;

    public iwh0(fo7 fo7Var, boolean z, boolean z2) {
        this.f15490a = fo7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwh0)) {
            return false;
        }
        iwh0 iwh0Var = (iwh0) obj;
        return this.f15490a.equals(iwh0Var.f15490a) && this.b == iwh0Var.b && this.c == iwh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f15490a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeStateModel=");
        sb.append(this.f15490a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
