package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ma50 implements oa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skm f21444a;
    public final skm b;
    public final skm c;

    public ma50(skm skmVar, skm skmVar2, skm skmVar3) {
        this.f21444a = skmVar;
        this.b = skmVar2;
        this.c = skmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma50)) {
            return false;
        }
        ma50 ma50Var = (ma50) obj;
        return this.f21444a.equals(ma50Var.f21444a) && this.b.equals(ma50Var.b) && this.c.equals(ma50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f21444a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreeIcons(firstIconModel=" + this.f21444a + ", secondIconModel=" + this.b + ", thirdIconModel=" + this.c + Separators.RPAREN;
    }
}
