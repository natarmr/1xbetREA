package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class mpq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22190a;
    public final ArrayList b;
    public final ArrayList c;

    public mpq0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f22190a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpq0)) {
            return false;
        }
        mpq0 mpq0Var = (mpq0) obj;
        return this.f22190a.equals(mpq0Var.f22190a) && this.b.equals(mpq0Var.b) && this.c.equals(mpq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f22190a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TirageCategoryTableUiModel(columnTitles=");
        sb.append(this.f22190a);
        sb.append(", rowTitles=");
        sb.append(this.b);
        sb.append(", cells=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
