package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d4g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5453a;
    public final int b;
    public final s8h c;
    public final s8h d;
    public final List e;

    public d4g(int i, int i2, s8h s8hVar, s8h s8hVar2, List list) {
        list.getClass();
        this.f5453a = i;
        this.b = i2;
        this.c = s8hVar;
        this.d = s8hVar2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4g)) {
            return false;
        }
        d4g d4gVar = (d4g) obj;
        return this.f5453a == d4gVar.f5453a && this.b == d4gVar.b && this.c.equals(d4gVar.c) && this.d.equals(d4gVar.d) && Intrinsics.d(this.e, d4gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f5453a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberCSMatchesStatisticModel(id=", this.f5453a, ", tournamentId=", ", teamOne=", this.b);
        sbT.append(this.c);
        sbT.append(", teamTwo=");
        sbT.append(this.d);
        sbT.append(", matches=");
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
