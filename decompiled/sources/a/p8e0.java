package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class p8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rhq f26549a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public p8e0(rhq rhqVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f26549a = rhqVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8e0)) {
            return false;
        }
        p8e0 p8e0Var = (p8e0) obj;
        return this.f26549a.equals(p8e0Var.f26549a) && this.b.equals(p8e0Var.b) && this.c.equals(p8e0Var.c) && this.d.equals(p8e0Var.d);
    }

    public final int hashCode() {
        return twn.g(this.d, twn.g(this.c, twn.g(this.b, this.f26549a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RatingTableUiModel(firstColumnTitle=" + this.f26549a + ", columnHeaderModelList=" + this.b + ", rowHeaderModelList=" + this.c + ", cellModelList=" + this.d + ", selectorsModel=null)";
    }
}
