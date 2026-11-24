package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ksk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisciplineDetailsParams f18817a;
    public final sff0 b;
    public final j0g0 c;
    public final j0g0 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final sip h;
    public final boolean i;

    public ksk(DisciplineDetailsParams disciplineDetailsParams, sff0 sff0Var, j0g0 j0g0Var, j0g0 j0g0Var2, List list, boolean z, boolean z2, sip sipVar, boolean z3) {
        list.getClass();
        this.f18817a = disciplineDetailsParams;
        this.b = sff0Var;
        this.c = j0g0Var;
        this.d = j0g0Var2;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = sipVar;
        this.i = z3;
    }

    public static ksk a(ksk kskVar, j0g0 j0g0Var, j0g0 j0g0Var2, sip sipVar, int i) {
        DisciplineDetailsParams disciplineDetailsParams = kskVar.f18817a;
        sff0 sff0Var = kskVar.b;
        if ((i & 4) != 0) {
            j0g0Var = kskVar.c;
        }
        j0g0 j0g0Var3 = j0g0Var;
        if ((i & 8) != 0) {
            j0g0Var2 = kskVar.d;
        }
        j0g0 j0g0Var4 = j0g0Var2;
        List list = kskVar.e;
        boolean z = kskVar.f;
        boolean z2 = kskVar.g;
        if ((i & 128) != 0) {
            sipVar = kskVar.h;
        }
        boolean z3 = kskVar.i;
        kskVar.getClass();
        list.getClass();
        return new ksk(disciplineDetailsParams, sff0Var, j0g0Var3, j0g0Var4, list, z, z2, sipVar, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksk)) {
            return false;
        }
        ksk kskVar = (ksk) obj;
        return this.f18817a.equals(kskVar.f18817a) && this.b.equals(kskVar.b) && Intrinsics.d(this.c, kskVar.c) && Intrinsics.d(this.d, kskVar.d) && Intrinsics.d(this.e, kskVar.e) && this.f == kskVar.f && this.g == kskVar.g && this.h == kskVar.h && this.i == kskVar.i;
    }

    public final int hashCode() {
        int iC = cs0.c(this.b, this.f18817a.hashCode() * 31, 31);
        j0g0 j0g0Var = this.c;
        int iB = (iC + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        j0g0 j0g0Var2 = this.d;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + brm0.e(brm0.e(dw9.a((iB + (j0g0Var2 != null ? j0g0.b(j0g0Var2.f15681a) : 0)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisciplineDetailsStateModel(params=");
        sb.append(this.f18817a);
        sb.append(", remoteConfig=");
        sb.append(this.b);
        sb.append(", headerResult=");
        sb.append(this.c);
        sb.append(", disciplineResult=");
        sb.append(this.d);
        sb.append(", specialEventList=");
        rz4.z(sb, ", tablet=", this.e, ", bettingDisabled=", this.f);
        sb.append(this.g);
        sb.append(", liveSwitchSelected=");
        sb.append(this.h);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
