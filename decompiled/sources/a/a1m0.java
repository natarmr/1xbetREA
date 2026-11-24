package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77a;
    public final Map b;
    public final Map c;
    public final a1m0 d;
    public final int e;

    public a1m0(List list, Map map, Map map2, a1m0 a1m0Var, int i) {
        list.getClass();
        map2.getClass();
        this.f77a = list;
        this.b = map;
        this.c = map2;
        this.d = a1m0Var;
        this.e = i;
    }

    public static a1m0 a(a1m0 a1m0Var, LinkedHashMap linkedHashMap, a1m0 a1m0Var2, int i, int i2) {
        List list = a1m0Var.f77a;
        Map map = a1m0Var.b;
        Map map2 = linkedHashMap;
        if ((i2 & 4) != 0) {
            map2 = a1m0Var.c;
        }
        Map map3 = map2;
        if ((i2 & 16) != 0) {
            i = a1m0Var.e;
        }
        a1m0Var.getClass();
        list.getClass();
        map3.getClass();
        return new a1m0(list, map, map3, a1m0Var2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1m0)) {
            return false;
        }
        a1m0 a1m0Var = (a1m0) obj;
        return Intrinsics.d(this.f77a, a1m0Var.f77a) && this.b.equals(a1m0Var.b) && Intrinsics.d(this.c, a1m0Var.c) && Intrinsics.d(this.d, a1m0Var.d) && this.e == a1m0Var.e;
    }

    public final int hashCode() {
        int iF = ohs0.f(this.c, ohs0.f(this.b, this.f77a.hashCode() * 31, 31), 31);
        a1m0 a1m0Var = this.d;
        return Integer.hashCode(this.e) + ((iF + (a1m0Var == null ? 0 : a1m0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageNetModel(titles=");
        sb.append(this.f77a);
        sb.append(", net=");
        sb.append(this.b);
        sb.append(", uiModels=");
        sb.append(this.c);
        sb.append(", thirdPlaceModel=");
        sb.append(this.d);
        sb.append(", initialPage=");
        return rz4.j(this.e, Separators.RPAREN, sb);
    }
}
