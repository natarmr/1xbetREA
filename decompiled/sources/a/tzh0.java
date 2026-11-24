package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tzh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cnew f34804a;
    public final edw b;
    public final List c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;

    public tzh0(Cnew cnew, edw edwVar, List list, long j, long j2, long j3, boolean z) {
        this.f34804a = cnew;
        this.b = edwVar;
        this.c = list;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
    }

    public static tzh0 a(tzh0 tzh0Var, Cnew cnew, edw edwVar, ArrayList arrayList, long j, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            cnew = tzh0Var.f34804a;
        }
        Cnew cnew2 = cnew;
        if ((i & 2) != 0) {
            edwVar = tzh0Var.b;
        }
        edw edwVar2 = edwVar;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = tzh0Var.c;
        }
        List list2 = list;
        long j4 = (i & 8) != 0 ? tzh0Var.d : j;
        long j5 = (i & 16) != 0 ? tzh0Var.e : j2;
        long j6 = (i & 32) != 0 ? tzh0Var.f : j3;
        boolean z = tzh0Var.g;
        tzh0Var.getClass();
        return new tzh0(cnew2, edwVar2, list2, j4, j5, j6, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzh0)) {
            return false;
        }
        tzh0 tzh0Var = (tzh0) obj;
        return Intrinsics.d(this.f34804a, tzh0Var.f34804a) && Intrinsics.d(this.b, tzh0Var.b) && this.c.equals(tzh0Var.c) && this.d == tzh0Var.d && this.e == tzh0Var.e && this.f == tzh0Var.f && this.g == tzh0Var.g;
    }

    public final int hashCode() {
        Cnew cnew = this.f34804a;
        int iHashCode = (cnew == null ? 0 : cnew.hashCode()) * 31;
        edw edwVar = this.b;
        return Boolean.hashCode(this.g) + rw2.b(rw2.b(rw2.b(dw9.a((iHashCode + (edwVar != null ? edwVar.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAwardStateModel(statisticScenarioModel=");
        sb.append(this.f34804a);
        sb.append(", gameDetailsScenarioModel=");
        sb.append(this.b);
        sb.append(", selectedNominantsId=");
        sb.append(this.c);
        sb.append(", selectedCategoryId=");
        sb.append(this.d);
        kng0.A(sb, ", selectedNominationId=", this.e, ", feedGameId=");
        hne.t(this.f, ", isNewEventParams=", sb, this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
