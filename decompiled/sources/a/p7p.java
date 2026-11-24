package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p7p implements r7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26517a;
    public final o0x b;
    public final String c;
    public final String d;
    public final chl0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final zia i;

    public p7p(String str, o0x o0xVar, String str2, String str3, chl0 chl0Var, boolean z, boolean z2, boolean z3, zia ziaVar) {
        str.getClass();
        str2.getClass();
        this.f26517a = str;
        this.b = o0xVar;
        this.c = str2;
        this.d = str3;
        this.e = chl0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = ziaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7p)) {
            return false;
        }
        p7p p7pVar = (p7p) obj;
        return Intrinsics.d(this.f26517a, p7pVar.f26517a) && this.b.equals(p7pVar.b) && Intrinsics.d(this.c, p7pVar.c) && this.d.equals(p7pVar.d) && this.e.equals(p7pVar.e) && this.f == p7pVar.f && this.g == p7pVar.g && this.h == p7pVar.h && this.i.equals(p7pVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(brm0.e(brm0.e((this.e.hashCode() + ua80.b(ua80.b(w6x.d(this.b, this.f26517a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoefWithBgAccentTeamAndBigTeamLogoAccentTeam(championshipLabel=");
        sb.append(this.f26517a);
        sb.append(", sportImage=");
        sb.append(this.b);
        sb.append(", opponentsLabel=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", sportMarket=");
        sb.append(this.e);
        sb.append(", takeEmptySpace=");
        sb.append(this.f);
        sb.append(", coefBlocked=");
        ua80.u(", cardBlocked=", ", cardIndicator=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
