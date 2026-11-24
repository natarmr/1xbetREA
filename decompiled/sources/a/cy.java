package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5148a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final List f;
    public final boolean g;
    public final String h;
    public final int i;
    public final int j;

    public cy(long j, String str, String str2, List list, String str3, List list2, boolean z, String str4, int i, int i2) {
        list.getClass();
        list2.getClass();
        this.f5148a = j;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = list2;
        this.g = z;
        this.h = str4;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.f5148a == cyVar.f5148a && this.b.equals(cyVar.b) && this.c.equals(cyVar.c) && Intrinsics.d(this.d, cyVar.d) && this.e.equals(cyVar.e) && Intrinsics.d(this.f, cyVar.f) && this.g == cyVar.g && this.h.equals(cyVar.h) && this.i == cyVar.i && this.j == cyVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, ua80.b(brm0.e(dw9.a(ua80.b(dw9.a(ua80.b(ua80.b(Long.hashCode(this.f5148a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5148a, "AdditionalInfoModel(sport=", ", champName=", this.b);
        ua80.t(", firstTeamName=", this.c, ", firstTeamImages=", sbO, this.d);
        ua80.t(", secondTeamName=", this.e, ", secondTeamImages=", sbO, this.f);
        hne.u(", isFinished=", ", gameScore=", this.h, sbO, this.g);
        rw2.s(this.i, this.j, ", teamNumber=", ", oppNumber=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
