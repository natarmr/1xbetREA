package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4427a;
    public final List b;
    public final ais c;
    public final bis d;
    public final boolean e;
    public final j700 f;
    public final boolean g;

    public cis(String str, List list, ais aisVar, bis bisVar, boolean z, j700 j700Var, boolean z2) {
        list.getClass();
        j700Var.getClass();
        this.f4427a = str;
        this.b = list;
        this.c = aisVar;
        this.d = bisVar;
        this.e = z;
        this.f = j700Var;
        this.g = z2;
    }

    public static cis a(cis cisVar, String str, List list, ais aisVar, bis bisVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = cisVar.f4427a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = cisVar.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            aisVar = cisVar.c;
        }
        ais aisVar2 = aisVar;
        if ((i & 8) != 0) {
            bisVar = cisVar.d;
        }
        bis bisVar2 = bisVar;
        if ((i & 16) != 0) {
            z = cisVar.e;
        }
        boolean z3 = z;
        j700 j700Var = cisVar.f;
        if ((i & 64) != 0) {
            z2 = cisVar.g;
        }
        cisVar.getClass();
        str2.getClass();
        list2.getClass();
        j700Var.getClass();
        return new cis(str2, list2, aisVar2, bisVar2, z3, j700Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cis)) {
            return false;
        }
        cis cisVar = (cis) obj;
        return this.f4427a.equals(cisVar.f4427a) && Intrinsics.d(this.b, cisVar.b) && this.c == cisVar.c && Intrinsics.d(this.d, cisVar.d) && this.e == cisVar.e && this.f == cisVar.f && this.g == cisVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + dw9.a(this.f4427a.hashCode() * 31, 31, this.b)) * 31;
        bis bisVar = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + brm0.e((iHashCode + (bisVar == null ? 0 : bisVar.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("GameItemsScreenState(headerTitle=", this.f4427a, ", eventCardList=", this.b, ", errorType=");
        sbF.append(this.c);
        sbF.append(", config=");
        sbF.append(this.d);
        sbF.append(", isRefreshing=");
        sbF.append(this.e);
        sbF.append(", screenType=");
        sbF.append(this.f);
        sbF.append(", isTablet=");
        return rw2.p(sbF, this.g, Separators.RPAREN);
    }
}
