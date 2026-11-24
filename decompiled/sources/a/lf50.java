package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19938a;
    public final re50 b;
    public final pe50 c;

    public lf50(List list, re50 re50Var, pe50 pe50Var) {
        list.getClass();
        pe50Var.getClass();
        this.f19938a = list;
        this.b = re50Var;
        this.c = pe50Var;
    }

    public static lf50 a(lf50 lf50Var, List list, re50 re50Var, pe50 pe50Var, int i) {
        if ((i & 1) != 0) {
            list = lf50Var.f19938a;
        }
        if ((i & 2) != 0) {
            re50Var = lf50Var.b;
        }
        if ((i & 4) != 0) {
            pe50Var = lf50Var.c;
        }
        lf50Var.getClass();
        list.getClass();
        pe50Var.getClass();
        return new lf50(list, re50Var, pe50Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf50)) {
            return false;
        }
        lf50 lf50Var = (lf50) obj;
        return Intrinsics.d(this.f19938a, lf50Var.f19938a) && Intrinsics.d(this.b, lf50Var.b) && Intrinsics.d(this.c, lf50Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f19938a.hashCode() * 31;
        re50 re50Var = this.b;
        return this.c.hashCode() + ((iHashCode + (re50Var == null ? 0 : re50Var.hashCode())) * 31);
    }

    public final String toString() {
        return "NavigationStack(entryList=" + this.f19938a + ", authChain=" + this.b + ", context=" + this.c + Separators.RPAREN;
    }
}
