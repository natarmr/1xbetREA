package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pdt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26822a;
    public final String b;
    public final List c;
    public final Map d;
    public final Map e;
    public final boolean f;
    public final List g;

    public pdt0(String str, String str2, List list, Map map, Map map2, boolean z, List list2) {
        list.getClass();
        list2.getClass();
        this.f26822a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = map2;
        this.f = z;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdt0)) {
            return false;
        }
        pdt0 pdt0Var = (pdt0) obj;
        return this.f26822a.equals(pdt0Var.f26822a) && this.b.equals(pdt0Var.b) && Intrinsics.d(this.c, pdt0Var.c) && this.d.equals(pdt0Var.d) && this.e.equals(pdt0Var.e) && this.f == pdt0Var.f && Intrinsics.d(this.g, pdt0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(ohs0.f(this.e, ohs0.f(this.d, dw9.a(ua80.b(this.f26822a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UniversalStageTableModel(title=", this.f26822a, ", logoUrl=", this.b, ", columnTitleModelList=");
        sbN.append(this.c);
        sbN.append(", tableContent=");
        sbN.append(this.d);
        sbN.append(", footerList=");
        sbN.append(this.e);
        sbN.append(", isEmptyContent=");
        sbN.append(this.f);
        sbN.append(", groupList=");
        return dw9.r(sbN, this.g, Separators.RPAREN);
    }
}
