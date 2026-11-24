package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20899a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public lzd(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        str.getClass();
        str4.getClass();
        this.f20899a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd)) {
            return false;
        }
        lzd lzdVar = (lzd) obj;
        return this.f20899a == lzdVar.f20899a && Intrinsics.d(this.b, lzdVar.b) && this.c.equals(lzdVar.c) && this.d.equals(lzdVar.d) && Intrinsics.d(this.e, lzdVar.e) && this.f.equals(lzdVar.f) && this.g.equals(lzdVar.g) && this.h.equals(lzdVar.h) && this.i.equals(lzdVar.i) && this.j == lzdVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f20899a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f20899a, "ConfirmUiModel(date=", ", typeText=", this.b);
        f140.v(sbO, ", numberText=", this.c, ", betText=", this.d);
        f140.v(sbO, ", coefficientString=", this.e, ", betCurrentText=", this.f);
        f140.v(sbO, ", saleText=", this.g, ", saleDescriptionText=", this.h);
        w6x.z(", buttonSaleText=", this.i, ", is24HourFormat=", sbO, this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
