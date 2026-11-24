package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17063a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final nsp h;

    public jsp(long j, String str, String str2, int i, int i2, int i3, String str3, nsp nspVar) {
        this.f17063a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = nspVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsp)) {
            return false;
        }
        jsp jspVar = (jsp) obj;
        return this.f17063a == jspVar.f17063a && this.b.equals(jspVar.b) && this.c.equals(jspVar.c) && this.d == jspVar.d && this.e == jspVar.e && this.f == jspVar.f && this.g.equals(jspVar.g) && Intrinsics.d(this.h, jspVar.h);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(this.f, twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f17063a) * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g);
        nsp nspVar = this.h;
        return iB + (nspVar == null ? 0 : nspVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f17063a, "FightCornerModel(feedId=", ", name=", this.b);
        axq.s(this.d, ", photoUrl=", this.c, ", wins=", sbO);
        rw2.s(this.e, this.f, ", losses=", ", draws=", sbO);
        sbO.append(", country=");
        sbO.append(this.g);
        sbO.append(", statistic=");
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
