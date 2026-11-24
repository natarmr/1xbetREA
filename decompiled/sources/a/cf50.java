package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df50 f4243a;
    public final List b;
    public final List c;
    public final int d;
    public lc00 e;

    public cf50(df50 df50Var, List list, List list2, int i) {
        this.f4243a = df50Var;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        lc00 lc00VarA = this.e;
        if (lc00VarA == null) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.addAll(this.b);
            df50 df50Var = this.f4243a;
            if (df50Var != null) {
                lc00VarB.add(df50Var);
            }
            lc00VarB.addAll(this.c);
            lc00VarA = kotlin.collections.a.a(lc00VarB);
            this.e = lc00VarA;
        }
        lc00VarA.getClass();
        return lc00VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cf50.class != obj.getClass()) {
            return false;
        }
        cf50 cf50Var = (cf50) obj;
        return this.d == cf50Var.d && a().equals(cf50Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + Separators.RPAREN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cf50() {
        iun iunVar = iun.f15405a;
        this(null, iunVar, iunVar, -1);
    }
}
