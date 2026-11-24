package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class egg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7763a;
    public final Integer b;
    public final String c;
    public final vdg d;
    public final List e;
    public final boolean f;
    public final sff0 g;
    public final boolean h;

    public egg(boolean z, Integer num, String str, vdg vdgVar, List list, boolean z2, sff0 sff0Var, boolean z3) {
        list.getClass();
        this.f7763a = z;
        this.b = num;
        this.c = str;
        this.d = vdgVar;
        this.e = list;
        this.f = z2;
        this.g = sff0Var;
        this.h = z3;
    }

    public static egg a(egg eggVar, boolean z, Integer num, vdg vdgVar, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = eggVar.f7763a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            num = eggVar.b;
        }
        Integer num2 = num;
        String str = eggVar.c;
        if ((i & 8) != 0) {
            vdgVar = eggVar.d;
        }
        vdg vdgVar2 = vdgVar;
        if ((i & 16) != 0) {
            list = eggVar.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z2 = eggVar.f;
        }
        sff0 sff0Var = eggVar.g;
        boolean z4 = eggVar.h;
        eggVar.getClass();
        list2.getClass();
        return new egg(z3, num2, str, vdgVar2, list2, z2, sff0Var, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egg)) {
            return false;
        }
        egg eggVar = (egg) obj;
        return this.f7763a == eggVar.f7763a && Intrinsics.d(this.b, eggVar.b) && this.c.equals(eggVar.c) && Intrinsics.d(this.d, eggVar.d) && Intrinsics.d(this.e, eggVar.e) && this.f == eggVar.f && this.g.equals(eggVar.g) && this.h == eggVar.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7763a) * 31;
        Integer num = this.b;
        int iB = ua80.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        vdg vdgVar = this.d;
        return Boolean.hashCode(this.h) + cs0.c(this.g, brm0.e(dw9.a((iB + (vdgVar != null ? vdgVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampionshipResultsStateModel(connected=");
        sb.append(this.f7763a);
        sb.append(", selectedDateIndex=");
        sb.append(this.b);
        sb.append(", currentLanguage=");
        sb.append(this.c);
        sb.append(", champResults=");
        sb.append(this.d);
        sb.append(", availableDates=");
        rz4.z(sb, ", isLoading=", this.e, ", remoteConfigModel=", this.f);
        sb.append(this.g);
        sb.append(", supportRtl=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
