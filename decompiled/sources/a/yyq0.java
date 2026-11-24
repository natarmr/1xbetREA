package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43480a;
    public final y1p b;
    public final List c;
    public final List d;

    public yyq0(String str, y1p y1pVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f43480a = str;
        this.b = y1pVar;
        this.c = list;
        this.d = list2;
    }

    public static yyq0 a(yyq0 yyq0Var, ArrayList arrayList, List list, int i) {
        y1p y1pVar = y1p.POPULAR_NEW_TOP;
        String str = (i & 1) != 0 ? yyq0Var.f43480a : "popular_new_top";
        if ((i & 2) != 0) {
            y1pVar = yyq0Var.b;
        }
        List list2 = arrayList;
        if ((i & 4) != 0) {
            list2 = yyq0Var.c;
        }
        if ((i & 8) != 0) {
            list = yyq0Var.d;
        }
        list2.getClass();
        list.getClass();
        return new yyq0(str, y1pVar, list2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyq0)) {
            return false;
        }
        yyq0 yyq0Var = (yyq0) obj;
        return this.f43480a.equals(yyq0Var.f43480a) && this.b == yyq0Var.b && Intrinsics.d(this.c, yyq0Var.c) && Intrinsics.d(this.d, yyq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f43480a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBannerState(screenType=");
        sb.append(this.f43480a);
        sb.append(", fatmanScreenType=");
        sb.append(this.b);
        sb.append(", bannerTapeList=");
        return kng0.n(", topEventList=", Separators.RPAREN, sb, this.c, this.d);
    }
}
