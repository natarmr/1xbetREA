package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f32047a;
    public final List b;
    public final List c;
    public final List d;
    public final boolean e;
    public final Set f;

    public sdt(btk0 btk0Var, List list, List list2, List list3, boolean z, Set set) {
        b1j.B(list, list2, list3);
        this.f32047a = btk0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = z;
        this.f = set;
    }

    public static sdt a(sdt sdtVar, btk0 btk0Var, List list, List list2, List list3, boolean z, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            btk0Var = sdtVar.f32047a;
        }
        btk0 btk0Var2 = btk0Var;
        if ((i & 2) != 0) {
            list = sdtVar.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = sdtVar.c;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = sdtVar.d;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            z = sdtVar.e;
        }
        boolean z2 = z;
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = sdtVar.f;
        }
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new sdt(btk0Var2, list4, list5, list6, z2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdt)) {
            return false;
        }
        sdt sdtVar = (sdt) obj;
        return this.f32047a.equals(sdtVar.f32047a) && Intrinsics.d(this.b, sdtVar.b) && Intrinsics.d(this.c, sdtVar.c) && Intrinsics.d(this.d, sdtVar.d) && this.e == sdtVar.e && this.f.equals(sdtVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(dw9.a(dw9.a(dw9.a(this.f32047a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesStateModel(contentStatus=");
        sb.append(this.f32047a);
        sb.append(", live=");
        sb.append(this.b);
        sb.append(", line=");
        b1j.y(", history=", ", isAllHistoryAvailable=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", expandedIds=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
