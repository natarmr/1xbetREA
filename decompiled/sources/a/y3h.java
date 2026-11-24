package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y3h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41953a;
    public final String b;
    public final List c;
    public final c110 d;
    public final String e;
    public final String f;
    public final List g;
    public final c110 h;

    public y3h(String str, String str2, List list, c110 c110Var, String str3, String str4, List list2, c110 c110Var2) {
        list.getClass();
        list2.getClass();
        this.f41953a = str;
        this.b = str2;
        this.c = list;
        this.d = c110Var;
        this.e = str3;
        this.f = str4;
        this.g = list2;
        this.h = c110Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3h)) {
            return false;
        }
        y3h y3hVar = (y3h) obj;
        return this.f41953a.equals(y3hVar.f41953a) && this.b.equals(y3hVar.b) && Intrinsics.d(this.c, y3hVar.c) && this.d.equals(y3hVar.d) && this.e.equals(y3hVar.e) && this.f.equals(y3hVar.f) && Intrinsics.d(this.g, y3hVar.g) && this.h.equals(y3hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(ua80.b(ua80.b((this.d.hashCode() + dw9.a(ua80.b(this.f41953a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberLolPlayerCompositionModel(firstTeamName=", this.f41953a, ", firstTeamImage=", this.b, ", firstPlayersInfo=");
        sbN.append(this.c);
        sbN.append(", firstTeamStatistic=");
        sbN.append(this.d);
        sbN.append(", secondTeamName=");
        f140.v(sbN, this.e, ", secondTeamImage=", this.f, ", secondPlayersInfo=");
        sbN.append(this.g);
        sbN.append(", secondTeamStatistic=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
