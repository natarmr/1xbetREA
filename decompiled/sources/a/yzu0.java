package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yzu0 implements a0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43533a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final pg f;
    public final String g;
    public final wui0 h;
    public final boolean i;
    public final rqm j;

    public yzu0(long j, String str, String str2, boolean z, long j2, pg pgVar, String str3, wui0 wui0Var, boolean z2, rqm rqmVar) {
        str.getClass();
        str3.getClass();
        this.f43533a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j2;
        this.f = pgVar;
        this.g = str3;
        this.h = wui0Var;
        this.i = z2;
        this.j = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzu0)) {
            return false;
        }
        yzu0 yzu0Var = (yzu0) obj;
        return this.f43533a == yzu0Var.f43533a && Intrinsics.d(this.b, yzu0Var.b) && this.c.equals(yzu0Var.c) && this.d == yzu0Var.d && this.e == yzu0Var.e && this.f == yzu0Var.f && Intrinsics.d(this.g, yzu0Var.g) && this.h == yzu0Var.h && this.i == yzu0Var.i && Intrinsics.d(this.j, yzu0Var.j);
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.c(this.h, ua80.b((this.f.hashCode() + rw2.b(brm0.e(ua80.b(ua80.b(Long.hashCode(this.f43533a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31), 31, this.i);
        rqm rqmVar = this.j;
        return iE + (rqmVar == null ? 0 : rqmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43533a, "AccountUiItem(balanceId=", ", balanceName=", this.b);
        w6x.z(", money=", this.c, ", active=", sbO, this.d);
        kng0.A(sbO, ", currencyId=", this.e, ", titleType=");
        sbO.append(this.f);
        sbO.append(", currency=");
        sbO.append(this.g);
        sbO.append(", position=");
        sbO.append(this.h);
        sbO.append(", hasSeparator=");
        sbO.append(this.i);
        sbO.append(", style=");
        sbO.append(this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
