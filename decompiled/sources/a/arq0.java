package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class arq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1359a;
    public final List b;
    public final List c;

    public arq0(lc00 lc00Var, lc00 lc00Var2, ArrayList arrayList) {
        lc00Var.getClass();
        lc00Var2.getClass();
        this.f1359a = arrayList;
        this.b = lc00Var;
        this.c = lc00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arq0)) {
            return false;
        }
        arq0 arq0Var = (arq0) obj;
        return this.f1359a.equals(arq0Var.f1359a) && Intrinsics.d(this.b, arq0Var.b) && Intrinsics.d(this.c, arq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f1359a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TirageTableUiModel(columnTitleList=");
        sb.append(this.f1359a);
        sb.append(", rowHeaderCellList=");
        sb.append(this.b);
        sb.append(", dataCellList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
