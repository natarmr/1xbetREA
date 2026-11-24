package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o580 implements p580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24676a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final lpm g;
    public final boolean h;

    public o580(String str, String str2, String str3, String str4, String str5, String str6, lpm lpmVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f24676a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = lpmVar;
        this.h = z;
    }

    @Override // a.p580
    public final boolean a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o580)) {
            return false;
        }
        o580 o580Var = (o580) obj;
        return Intrinsics.d(this.f24676a, o580Var.f24676a) && Intrinsics.d(this.b, o580Var.b) && this.c.equals(o580Var.c) && this.d.equals(o580Var.d) && this.e.equals(o580Var.e) && this.f.equals(o580Var.f) && this.g.equals(o580Var.g) && this.h == o580Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + f140.e(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f24676a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoPlayersOpponentsUiModel(firstTeamName=", this.f24676a, ", secondTeamName=", this.b, ", firstTeamFirstLogoUrl=");
        f140.v(sbN, this.c, ", firstTeamSecondLogoUrl=", this.d, ", secondTeamFirstLogoUrl=");
        f140.v(sbN, this.e, ", secondTeamSecondLogoUrl=", this.f, ", scoreModel=");
        sbN.append(this.g);
        sbN.append(", isSupportRtl=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
