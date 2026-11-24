package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final odp0 f13924a;
    public final String b;
    public final odp0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ikv0 h;
    public final ikv0 i;

    public hzy(odp0 odp0Var, String str, odp0 odp0Var2, String str2, String str3, String str4, String str5, ikv0 ikv0Var, ikv0 ikv0Var2) {
        str3.getClass();
        str4.getClass();
        this.f13924a = odp0Var;
        this.b = str;
        this.c = odp0Var2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = ikv0Var;
        this.i = ikv0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzy)) {
            return false;
        }
        hzy hzyVar = (hzy) obj;
        return this.f13924a.equals(hzyVar.f13924a) && this.b.equals(hzyVar.b) && this.c.equals(hzyVar.c) && this.d.equals(hzyVar.d) && Intrinsics.d(this.e, hzyVar.e) && Intrinsics.d(this.f, hzyVar.f) && this.g.equals(hzyVar.g) && this.h == hzyVar.h && this.i == hzyVar.i;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b((this.c.f25087a.hashCode() + ua80.b(this.f13924a.f25087a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ikv0 ikv0Var = this.h;
        int iHashCode = (iB + (ikv0Var == null ? 0 : ikv0Var.hashCode())) * 31;
        ikv0 ikv0Var2 = this.i;
        return iHashCode + (ikv0Var2 != null ? ikv0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGameItemUiModel(teamOneLogo=");
        sb.append(this.f13924a);
        sb.append(", teamOneName=");
        sb.append(this.b);
        sb.append(", teamTwoLogo=");
        sb.append(this.c);
        sb.append(", teamTwoName=");
        sb.append(this.d);
        sb.append(", date=");
        f140.v(sb, this.e, ", score=", this.f, ", statGameId=");
        sb.append(this.g);
        sb.append(", teamOneWinningIndicator=");
        sb.append(this.h);
        sb.append(", teamTwoWinningIndicator=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
