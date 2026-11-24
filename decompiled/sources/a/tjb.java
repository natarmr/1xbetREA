package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tjb extends v8b {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final int l;
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjb(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2) {
        super(6, Integer.valueOf(i2), Integer.valueOf(i), list);
        str5.getClass();
        list.getClass();
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = list;
        this.l = i;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjb)) {
            return false;
        }
        tjb tjbVar = (tjb) obj;
        return this.d.equals(tjbVar.d) && this.e.equals(tjbVar.e) && this.f.equals(tjbVar.f) && this.g.equals(tjbVar.g) && Intrinsics.d(this.h, tjbVar.h) && this.i.equals(tjbVar.i) && this.j.equals(tjbVar.j) && Intrinsics.d(this.k, tjbVar.k) && this.l == tjbVar.l && this.m == tjbVar.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + twn.a(this.l, dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ChampionshipCellContentUiModel(firstTeamLogo=", this.d, ", secondTeamLogo=", this.e, ", firstTeamTitle=");
        f140.v(sbN, this.f, ", secondTeamTitle=", this.g, ", date=");
        f140.v(sbN, this.h, ", time=", this.i, ", period=");
        cs0.y(this.j, ", cellContentList=", ", widthMin=", sbN, this.k);
        return w6x.o(this.l, this.m, ", widthMax=", Separators.RPAREN, sbN);
    }
}
