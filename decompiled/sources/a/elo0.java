package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class elo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ndp0 f8011a;
    public final String b;
    public final ndp0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final jkv0 h;
    public final jkv0 i;

    public elo0(ndp0 ndp0Var, String str, ndp0 ndp0Var2, String str2, String str3, String str4, String str5, jkv0 jkv0Var, jkv0 jkv0Var2) {
        str3.getClass();
        str4.getClass();
        this.f8011a = ndp0Var;
        this.b = str;
        this.c = ndp0Var2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = jkv0Var;
        this.i = jkv0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elo0)) {
            return false;
        }
        elo0 elo0Var = (elo0) obj;
        return this.f8011a.equals(elo0Var.f8011a) && this.b.equals(elo0Var.b) && this.c.equals(elo0Var.c) && this.d.equals(elo0Var.d) && Intrinsics.d(this.e, elo0Var.e) && Intrinsics.d(this.f, elo0Var.f) && this.g.equals(elo0Var.g) && this.h == elo0Var.h && this.i == elo0Var.i;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b((this.c.f23347a.hashCode() + ua80.b(this.f8011a.f23347a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        jkv0 jkv0Var = this.h;
        int iHashCode = (iB + (jkv0Var == null ? 0 : jkv0Var.hashCode())) * 31;
        jkv0 jkv0Var2 = this.i;
        return iHashCode + (jkv0Var2 != null ? jkv0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableRowUiModel(teamOneLogo=");
        sb.append(this.f8011a);
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
