package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ip20 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15143a;
    public final String b;
    public final d4d c;
    public final String d;
    public final d4d e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public ip20(String str, String str2, d4d d4dVar, String str3, d4d d4dVar2, String str4, String str5, boolean z, boolean z2) {
        d4dVar.getClass();
        d4dVar2.getClass();
        str4.getClass();
        this.f15143a = str;
        this.b = str2;
        this.c = d4dVar;
        this.d = str3;
        this.e = d4dVar2;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip20)) {
            return false;
        }
        ip20 ip20Var = (ip20) obj;
        return this.f15143a.equals(ip20Var.f15143a) && this.b.equals(ip20Var.b) && this.c == ip20Var.c && this.d.equals(ip20Var.d) && this.e == ip20Var.e && Intrinsics.d(this.f, ip20Var.f) && this.g.equals(ip20Var.g) && this.h == ip20Var.h && this.i == ip20Var.i;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(ua80.b(ua80.b(dw9.b(this.e, ua80.b(dw9.b(this.c, ua80.b(this.f15143a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MapStatisticItemUiModel(mapName=", this.f15143a, ", ctWinRate=", this.b, ", ctWinRateColor=");
        sbN.append(this.c);
        sbN.append(", tWinRate=");
        sbN.append(this.d);
        sbN.append(", tWinRateColor=");
        sbN.append(this.e);
        sbN.append(", mapCount=");
        sbN.append(this.f);
        sbN.append(", backgroundImageUrl=");
        brm0.C(this.g, ", isFirst=", ", isLast=", sbN, this.h);
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
