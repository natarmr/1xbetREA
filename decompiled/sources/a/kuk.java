package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0g0 f18914a;
    public final j0g0 b;
    public final j0g0 c;
    public final j0g0 d;
    public final boolean e;
    public final List f;
    public final j0g0 g;
    public final j0g0 h;
    public final j0g0 i;
    public final Object j;

    public kuk(j0g0 j0g0Var, j0g0 j0g0Var2, j0g0 j0g0Var3, j0g0 j0g0Var4, boolean z, List list, j0g0 j0g0Var5, j0g0 j0g0Var6, j0g0 j0g0Var7, Object obj) {
        list.getClass();
        this.f18914a = j0g0Var;
        this.b = j0g0Var2;
        this.c = j0g0Var3;
        this.d = j0g0Var4;
        this.e = z;
        this.f = list;
        this.g = j0g0Var5;
        this.h = j0g0Var6;
        this.i = j0g0Var7;
        this.j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuk)) {
            return false;
        }
        kuk kukVar = (kuk) obj;
        if (!Intrinsics.d(this.f18914a, kukVar.f18914a) || !Intrinsics.d(this.b, kukVar.b) || !Intrinsics.d(this.c, kukVar.c) || !Intrinsics.d(this.d, kukVar.d) || this.e != kukVar.e || !Intrinsics.d(this.f, kukVar.f) || !Intrinsics.d(this.g, kukVar.g) || !Intrinsics.d(this.h, kukVar.h) || !Intrinsics.d(this.i, kukVar.i)) {
            return false;
        }
        Object obj2 = kukVar.j;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.j, obj2);
    }

    public final int hashCode() {
        j0g0 j0g0Var = this.f18914a;
        int iB = (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a)) * 31;
        j0g0 j0g0Var2 = this.b;
        int iB2 = (iB + (j0g0Var2 == null ? 0 : j0g0.b(j0g0Var2.f15681a))) * 31;
        j0g0 j0g0Var3 = this.c;
        int iB3 = (iB2 + (j0g0Var3 == null ? 0 : j0g0.b(j0g0Var3.f15681a))) * 31;
        j0g0 j0g0Var4 = this.d;
        int iA = dw9.a(brm0.e((iB3 + (j0g0Var4 == null ? 0 : j0g0.b(j0g0Var4.f15681a))) * 31, 31, this.e), 31, this.f);
        j0g0 j0g0Var5 = this.g;
        int iB4 = (iA + (j0g0Var5 == null ? 0 : j0g0.b(j0g0Var5.f15681a))) * 31;
        j0g0 j0g0Var6 = this.h;
        int iB5 = (iB4 + (j0g0Var6 == null ? 0 : j0g0.b(j0g0Var6.f15681a))) * 31;
        j0g0 j0g0Var7 = this.i;
        return j0g0.b(this.j) + ((iB5 + (j0g0Var7 != null ? j0g0.b(j0g0Var7.f15681a) : 0)) * 31);
    }

    public final String toString() {
        String strD = j0g0.d(this.j);
        StringBuilder sb = new StringBuilder("DisciplineScenarioModel(liveTopChamps=");
        sb.append(this.f18914a);
        sb.append(", lineTopChamps=");
        sb.append(this.b);
        sb.append(", liveEvents=");
        sb.append(this.c);
        sb.append(", lineEvents=");
        sb.append(this.d);
        sb.append(", bettingDisabled=");
        vqd.y(sb, ", specialEventList=", this.f, ", activeTeams=", this.e);
        sb.append(this.g);
        sb.append(", transfers=");
        sb.append(this.h);
        sb.append(", leaderBoard=");
        sb.append(this.i);
        sb.append(", realTopChamps=");
        sb.append(strD);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
