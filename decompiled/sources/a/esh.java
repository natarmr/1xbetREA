package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class esh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8327a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final boolean k;

    public esh(long j, String str, int i, String str2, String str3, String str4, String str5, List list, List list2, List list3, boolean z) {
        b1j.B(list, list2, list3);
        this.f8327a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esh)) {
            return false;
        }
        esh eshVar = (esh) obj;
        return this.f8327a == eshVar.f8327a && this.b.equals(eshVar.b) && this.c == eshVar.c && this.d.equals(eshVar.d) && this.e.equals(eshVar.e) && this.f.equals(eshVar.f) && this.g.equals(eshVar.g) && Intrinsics.d(this.h, eshVar.h) && Intrinsics.d(this.i, eshVar.i) && Intrinsics.d(this.j, eshVar.j) && this.k == eshVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + dw9.a(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.c, ua80.b(Long.hashCode(this.f8327a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8327a, "CyberWorldCupModel(id=", ", champName=", this.b);
        w6x.w(this.c, ", prizePool=", ", description=", this.d, sbO);
        f140.v(sbO, ", rules=", this.e, ", startDate=", this.f);
        ua80.t(", endDate=", this.g, ", players=", sbO, this.h);
        hne.v(", teams=", ", teamsPrizeDistribution=", sbO, this.i, this.j);
        return f140.n(sbO, ", isCurrencySymbolOnLeft=", this.k, Separators.RPAREN);
    }
}
