package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fiv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9607a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public fiv(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f9607a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiv)) {
            return false;
        }
        fiv fivVar = (fiv) obj;
        return this.f9607a.equals(fivVar.f9607a) && this.b.equals(fivVar.b) && this.c.equals(fivVar.c) && this.d.equals(fivVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, twn.g(this.b, this.f9607a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GroupTableItemUiModel(cellList=" + this.f9607a + ", rowHeaderList=" + this.b + ", columnHeaderList=" + this.c + ", shadowList=" + this.d + Separators.RPAREN;
    }
}
