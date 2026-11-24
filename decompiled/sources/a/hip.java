package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13125a;
    public final List b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    public hip(List list, lc00 lc00Var, ArrayList arrayList, ArrayList arrayList2, lc00 lc00Var2, lc00 lc00Var3, List list2, List list3, List list4, List list5) {
        list.getClass();
        lc00Var.getClass();
        lc00Var2.getClass();
        lc00Var3.getClass();
        list2.getClass();
        b1j.B(list3, list4, list5);
        this.f13125a = list;
        this.b = lc00Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = lc00Var2;
        this.f = lc00Var3;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hip)) {
            return false;
        }
        hip hipVar = (hip) obj;
        return Intrinsics.d(this.f13125a, hipVar.f13125a) && Intrinsics.d(this.b, hipVar.b) && this.c.equals(hipVar.c) && this.d.equals(hipVar.d) && Intrinsics.d(this.e, hipVar.e) && Intrinsics.d(this.f, hipVar.f) && Intrinsics.d(this.g, hipVar.g) && Intrinsics.d(this.h, hipVar.h) && Intrinsics.d(this.i, hipVar.i) && Intrinsics.d(this.j, hipVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(twn.g(this.d, twn.g(this.c, dw9.a(this.f13125a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("Success(specialEvents=", ", highRatedChamps=", this.f13125a, ", sportModels=", this.b);
        sbT.append(this.c);
        sbT.append(", sportBanner=");
        sbT.append(this.d);
        sbT.append(", liveGames=");
        b1j.y(", lineGames=", ", liveChamps=", sbT, this.e, this.f);
        b1j.y(", lineChamps=", ", liveExpress=", sbT, this.g, this.h);
        return kng0.n(", lineExpress=", Separators.RPAREN, sbT, this.i, this.j);
    }
}
