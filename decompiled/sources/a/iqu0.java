package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iqu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15227a;
    public final String b;

    public iqu0(int i, String str) {
        this.f15227a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqu0)) {
            return false;
        }
        iqu0 iqu0Var = (iqu0) obj;
        return this.f15227a == iqu0Var.f15227a && this.b.equals(iqu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f15227a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f15227a, "VirtualGameForCategoryModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
