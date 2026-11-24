package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q7p implements r7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28262a;
    public final n0x b;
    public final y7p c;
    public final String d;
    public final String e;
    public final chl0 f;
    public final boolean g;
    public final zia h;

    public q7p(String str, n0x n0xVar, y7p y7pVar, String str2, String str3, chl0 chl0Var, boolean z, zia ziaVar) {
        brm0.B(str, str2, str3);
        this.f28262a = str;
        this.b = n0xVar;
        this.c = y7pVar;
        this.d = str2;
        this.e = str3;
        this.f = chl0Var;
        this.g = z;
        this.h = ziaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7p)) {
            return false;
        }
        q7p q7pVar = (q7p) obj;
        return Intrinsics.d(this.f28262a, q7pVar.f28262a) && this.b.equals(q7pVar.b) && this.c.equals(q7pVar.c) && Intrinsics.d(this.d, q7pVar.d) && Intrinsics.d(this.e, q7pVar.e) && this.f.equals(q7pVar.f) && this.g == q7pVar.g && this.h.equals(q7pVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e((this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + f140.f(this.b, this.f28262a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        return "SmallTeamLogoAccentCoef(championshipLabel=" + this.f28262a + ", sportImage=" + this.b + ", opponentsModel=" + this.c + ", infoLabel=" + this.d + ", submarketLabel=" + this.e + ", sportMarket=" + this.f + ", coefBlocked=" + this.g + ", cardIndicator=" + this.h + Separators.RPAREN;
    }
}
