package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v7q implements e8q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh7 f36941a;
    public final ql5 b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public v7q(yh7 yh7Var, ql5 ql5Var, double d, String str, String str2, String str3, String str4, boolean z) {
        str2.getClass();
        str3.getClass();
        this.f36941a = yh7Var;
        this.b = ql5Var;
        this.c = d;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7q)) {
            return false;
        }
        v7q v7qVar = (v7q) obj;
        return this.f36941a.equals(v7qVar.f36941a) && this.b.equals(v7qVar.b) && Double.compare(this.c, v7qVar.c) == 0 && this.d.equals(v7qVar.d) && Intrinsics.d(this.e, v7qVar.e) && Intrinsics.d(this.f, v7qVar.f) && this.g.equals(v7qVar.g) && this.h == v7qVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.c, (this.b.hashCode() + (this.f36941a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBetSuccessMessage(betResultModel=");
        sb.append(this.f36941a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", betSum=");
        hne.w(sb, this.c, ", coefficient=", this.d);
        f140.v(sb, ", betNumber=", this.e, ", possibleWinTitle=", this.f);
        w6x.z(", possibleWinSum=", this.g, ", isAvailablePossibleWinTax=", sb, this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
