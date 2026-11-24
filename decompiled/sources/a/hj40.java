package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hj40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13143a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;

    public hj40(String str, String str2, List list, String str3, String str4, List list2) {
        list.getClass();
        list2.getClass();
        this.f13143a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj40)) {
            return false;
        }
        hj40 hj40Var = (hj40) obj;
        return this.f13143a.equals(hj40Var.f13143a) && this.b.equals(hj40Var.b) && Intrinsics.d(this.c, hj40Var.c) && this.d.equals(hj40Var.d) && this.e.equals(hj40Var.e) && Intrinsics.d(this.f, hj40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(dw9.a(ua80.b(this.f13143a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MlbbPlayerCompositionModel(firstTeamName=", this.f13143a, ", firstTeamImage=", this.b, ", firstPlayersInfo=");
        h97.y(", secondTeamName=", this.d, ", secondTeamImage=", sbN, this.c);
        return rw2.m(this.e, ", secondPlayersInfo=", Separators.RPAREN, sbN, this.f);
    }
}
