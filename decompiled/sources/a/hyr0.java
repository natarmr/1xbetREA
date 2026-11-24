package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13873a;
    public final long b;
    public final String c;
    public final Date d;
    public final Date e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final fyr0 l;

    public hyr0(String str, long j, String str2, Date date, Date date2, String str3, String str4, String str5, String str6, String str7, String str8, fyr0 fyr0Var) {
        str.getClass();
        str4.getClass();
        this.f13873a = str;
        this.b = j;
        this.c = str2;
        this.d = date;
        this.e = date2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = fyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyr0)) {
            return false;
        }
        hyr0 hyr0Var = (hyr0) obj;
        return Intrinsics.d(this.f13873a, hyr0Var.f13873a) && this.b == hyr0Var.b && Intrinsics.d(this.c, hyr0Var.c) && this.d.equals(hyr0Var.d) && this.e.equals(hyr0Var.e) && this.f.equals(hyr0Var.f) && Intrinsics.d(this.g, hyr0Var.g) && this.h.equals(hyr0Var.h) && this.i.equals(hyr0Var.i) && this.j.equals(hyr0Var.j) && this.k.equals(hyr0Var.k) && this.l.equals(hyr0Var.l);
    }

    public final int hashCode() {
        int iB = rw2.b(this.f13873a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.l.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.i(this.e, brm0.i(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Header(title=", this.f13873a, ", currencyId=");
        sbO.append(", mediaValue=");
        sbO.append(this.c);
        sbO.append(", startDate=");
        sbO.append(this.d);
        sbO.append(", endDate=");
        sbO.append(this.e);
        sbO.append(", description=");
        sbO.append(this.f);
        f140.v(sbO, ", prizeTitle=", this.g, ", prizePool=", this.h);
        f140.v(sbO, ", sum=", this.i, ", currencySymbol=", this.j);
        sbO.append(", freeSpins=");
        sbO.append(this.k);
        sbO.append(", counter=");
        sbO.append(this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
