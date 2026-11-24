package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class by80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3405a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final List f;

    public by80(String str, String str2, String str3, String str4, ArrayList arrayList, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f3405a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by80)) {
            return false;
        }
        by80 by80Var = (by80) obj;
        return Intrinsics.d(this.f3405a, by80Var.f3405a) && Intrinsics.d(this.b, by80Var.b) && Intrinsics.d(this.c, by80Var.c) && Intrinsics.d(this.d, by80Var.d) && this.e.equals(by80Var.e) && Intrinsics.d(this.f, by80Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.g(this.e, ua80.b(ua80.b(ua80.b(this.f3405a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnersTeamInfoModel(teamName=", this.f3405a, ", teamId=", this.b, ", teamImage=");
        f140.v(sbN, this.c, ", teamAdditionalInfo=", this.d, ", teamSubSportIds=");
        sbN.append(this.e);
        sbN.append(", simpleDisciplineModels=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
