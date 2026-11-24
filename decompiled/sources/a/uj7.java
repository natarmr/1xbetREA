package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5w f35763a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;
    public final double f;
    public final k77 g;

    public uj7(a5w a5wVar, List list, List list2, List list3, String str, double d, k77 k77Var) {
        b1j.B(list, list2, list3);
        this.f35763a = a5wVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = str;
        this.f = d;
        this.g = k77Var;
    }

    public static uj7 a(uj7 uj7Var, a5w a5wVar, List list, List list2, int i) {
        if ((i & 1) != 0) {
            a5wVar = uj7Var.f35763a;
        }
        a5w a5wVar2 = a5wVar;
        List list3 = uj7Var.b;
        if ((i & 4) != 0) {
            list = uj7Var.c;
        }
        List list4 = list;
        if ((i & 8) != 0) {
            list2 = uj7Var.d;
        }
        List list5 = list2;
        String str = uj7Var.e;
        double d = uj7Var.f;
        k77 k77Var = uj7Var.g;
        uj7Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new uj7(a5wVar2, list3, list4, list5, str, d, k77Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj7)) {
            return false;
        }
        uj7 uj7Var = (uj7) obj;
        return Intrinsics.d(this.f35763a, uj7Var.f35763a) && Intrinsics.d(this.b, uj7Var.b) && Intrinsics.d(this.c, uj7Var.c) && Intrinsics.d(this.d, uj7Var.d) && this.e.equals(uj7Var.e) && Double.compare(this.f, uj7Var.f) == 0 && this.g == uj7Var.g;
    }

    public final int hashCode() {
        a5w a5wVar = this.f35763a;
        return this.g.hashCode() + brm0.d(this.f, ua80.b(dw9.a(dw9.a(dw9.a((a5wVar == null ? 0 : a5wVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetSaleConfirmModel(historyModel=");
        sb.append(this.f35763a);
        sb.append(", specialEvents=");
        sb.append(this.b);
        sb.append(", eventGroupsList=");
        b1j.y(", eventModelList=", ", currency=", sb, this.c, this.d);
        hne.A(sb, this.e, ", saleSum=", this.f);
        sb.append(", betHistoryStyle=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
