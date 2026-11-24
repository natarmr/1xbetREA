package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39405a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Float e;
    public final Integer f;
    public final Integer g;
    public final Float h;
    public final boolean i;
    public final int j;
    public final List k;
    public final String l;

    public wmg(String str, String str2, String str3, Integer num, Float f, Integer num2, Integer num3, Float f2, boolean z, int i, List list, String str4) {
        str.getClass();
        list.getClass();
        this.f39405a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = f;
        this.f = num2;
        this.g = num3;
        this.h = f2;
        this.i = z;
        this.j = i;
        this.k = list;
        this.l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmg)) {
            return false;
        }
        wmg wmgVar = (wmg) obj;
        return Intrinsics.d(this.f39405a, wmgVar.f39405a) && this.b.equals(wmgVar.b) && this.c.equals(wmgVar.c) && Intrinsics.d(this.d, wmgVar.d) && Intrinsics.d(this.e, wmgVar.e) && Intrinsics.d(this.f, wmgVar.f) && Intrinsics.d(this.g, wmgVar.g) && Intrinsics.d(this.h, wmgVar.h) && this.i == wmgVar.i && this.j == wmgVar.j && Intrinsics.d(this.k, wmgVar.k) && this.l.equals(wmgVar.l);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f39405a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.e;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.h;
        return this.l.hashCode() + dw9.a(twn.a(this.j, brm0.e((iHashCode4 + (f2 != null ? f2.hashCode() : 0)) * 31, 31, this.i), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberDotaPlayerModel(playerId=", this.f39405a, ", playerName=", this.b, ", playerImage=");
        axq.x(this.d, this.c, ", countMaps=", ", winRate=", sbN);
        sbN.append(this.e);
        sbN.append(", goldInMinute=");
        sbN.append(this.f);
        sbN.append(", experienceInMinute=");
        sbN.append(this.g);
        sbN.append(", kda=");
        sbN.append(this.h);
        sbN.append(", captain=");
        ua80.q(this.j, ", position=", ", heroes=", sbN, this.i);
        sbN.append(this.k);
        sbN.append(", playerFlag=");
        sbN.append(this.l);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
