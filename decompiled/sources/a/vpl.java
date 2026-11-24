package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37811a;
    public final String b;
    public final String c;
    public final xpl d;
    public final String e;
    public final n0x f;
    public final String g;
    public final String h;
    public final wpl i;

    public vpl(long j, String str, String str2, xpl xplVar, String str3, n0x n0xVar, String str4, String str5, wpl wplVar) {
        str2.getClass();
        str3.getClass();
        this.f37811a = j;
        this.b = str;
        this.c = str2;
        this.d = xplVar;
        this.e = str3;
        this.f = n0xVar;
        this.g = str4;
        this.h = str5;
        this.i = wplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpl)) {
            return false;
        }
        vpl vplVar = (vpl) obj;
        return this.f37811a == vplVar.f37811a && this.b.equals(vplVar.b) && Intrinsics.d(this.c, vplVar.c) && this.d == vplVar.d && Intrinsics.d(this.e, vplVar.e) && this.f.equals(vplVar.f) && this.g.equals(vplVar.g) && Intrinsics.d(this.h, vplVar.h) && this.i.equals(vplVar.i);
    }

    public final int hashCode() {
        int iB = ua80.b(f140.f(this.f, ua80.b((this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f37811a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31), 31, this.g);
        String str = this.h;
        return this.i.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37811a, "DsAggregatorTournamentCardItemUiModel(tournamentId=", ", amount=", this.b);
        sbO.append(", title=");
        sbO.append(this.c);
        sbO.append(", tagType=");
        sbO.append(this.d);
        sbO.append(", tagLabel=");
        sbO.append(this.e);
        sbO.append(", picture=");
        sbO.append(this.f);
        f140.v(sbO, ", subTitle=", this.g, ", additionalTagLabel=", this.h);
        sbO.append(", periodModel=");
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
