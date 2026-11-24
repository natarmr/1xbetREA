package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42525a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final are f;

    public yf6(long j, List list, boolean z, boolean z2, long j2, are areVar) {
        list.getClass();
        areVar.getClass();
        this.f42525a = j;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = j2;
        this.f = areVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf6)) {
            return false;
        }
        yf6 yf6Var = (yf6) obj;
        return this.f42525a == yf6Var.f42525a && Intrinsics.d(this.b, yf6Var.b) && this.c == yf6Var.c && this.d == yf6Var.d && this.e == yf6Var.e && Intrinsics.d(this.f, yf6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(brm0.e(brm0.e(dw9.a(Long.hashCode(this.f42525a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f42525a, "BetBuilderEventsParamsModel(gameId=", ", selections=", this.b);
        w6x.A(", live=", ", cutCoef=", sbP, this.c, this.d);
        kng0.A(sbP, ", userId=", this.e, ", countryModel=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
