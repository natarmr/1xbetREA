package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o7p implements r7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24797a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;
    public final chl0 f;
    public final boolean g;
    public final zia h;

    public o7p(String str, n0x n0xVar, String str2, String str3, String str4, chl0 chl0Var, boolean z, zia ziaVar) {
        cs0.x(str, str2, str3, str4);
        this.f24797a = str;
        this.b = n0xVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = chl0Var;
        this.g = z;
        this.h = ziaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7p)) {
            return false;
        }
        o7p o7pVar = (o7p) obj;
        return Intrinsics.d(this.f24797a, o7pVar.f24797a) && this.b.equals(o7pVar.b) && Intrinsics.d(this.c, o7pVar.c) && Intrinsics.d(this.d, o7pVar.d) && Intrinsics.d(this.e, o7pVar.e) && this.f.equals(o7pVar.f) && this.g == o7pVar.g && this.h.equals(o7pVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e((this.f.hashCode() + ua80.b(ua80.b(ua80.b(f140.f(this.b, this.f24797a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampNameAccentCoefAndCompactAccentMarket(championshipLabel=");
        sb.append(this.f24797a);
        sb.append(", sportImage=");
        sb.append(this.b);
        sb.append(", opponentsLabel=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", submarketLabel=");
        sb.append(this.e);
        sb.append(", sportMarket=");
        sb.append(this.f);
        sb.append(", coefBlocked=");
        sb.append(this.g);
        sb.append(", cardIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
