package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sek0 f40698a;
    public final String b;
    public final String c;
    public final idk0 d;
    public final kdk0 e;
    public final Integer f;
    public final String g;

    public xdk0(sek0 sek0Var, String str, String str2, idk0 idk0Var, kdk0 kdk0Var, Integer num, int i) {
        str2 = (i & 4) != 0 ? "" : str2;
        idk0Var = (i & 8) != 0 ? ujn.Z : idk0Var;
        kdk0Var = (i & 16) != 0 ? gqw0.D1 : kdk0Var;
        num = (i & 32) != 0 ? null : num;
        String str3 = (i & 64) == 0 ? "SnackBarToCoupon" : null;
        sek0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f40698a = sek0Var;
        this.b = str;
        this.c = str2;
        this.d = idk0Var;
        this.e = kdk0Var;
        this.f = num;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdk0)) {
            return false;
        }
        xdk0 xdk0Var = (xdk0) obj;
        return Intrinsics.d(this.f40698a, xdk0Var.f40698a) && Intrinsics.d(this.b, xdk0Var.b) && this.c.equals(xdk0Var.c) && this.d.equals(xdk0Var.d) && this.e.equals(xdk0Var.e) && Intrinsics.d(this.f, xdk0Var.f) && Intrinsics.d(this.g, xdk0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f40698a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        Integer num = this.f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarModel(type=");
        sb.append(this.f40698a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", typeAction=");
        sb.append(this.d);
        sb.append(", typeDuration=");
        sb.append(this.e);
        sb.append(", icon=");
        sb.append(this.f);
        sb.append(", tag=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
