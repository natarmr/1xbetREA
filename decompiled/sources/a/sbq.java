package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31947a;
    public final double b;
    public final double c;
    public final long d;
    public final wbq e;

    public sbq(String str, double d, double d2, long j, wbq wbqVar) {
        str.getClass();
        this.f31947a = str;
        this.b = d;
        this.c = d2;
        this.d = j;
        this.e = wbqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbq)) {
            return false;
        }
        sbq sbqVar = (sbq) obj;
        return Intrinsics.d(this.f31947a, sbqVar.f31947a) && Double.compare(this.b, sbqVar.b) == 0 && Double.compare(this.c, sbqVar.c) == 0 && this.d == sbqVar.d && this.e == sbqVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(brm0.d(this.c, brm0.d(this.b, this.f31947a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinanceEventModel(coefEventDescription=");
        sb.append(this.f31947a);
        sb.append(", coefficient=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", price=", ", seconds=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
