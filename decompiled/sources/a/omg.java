package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class omg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25503a;
    public final int b;
    public final s8h c;
    public final s8h d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final List i;

    public omg(int i, int i2, s8h s8hVar, s8h s8hVar2, String str, int i3, int i4, String str2, List list) {
        list.getClass();
        this.f25503a = i;
        this.b = i2;
        this.c = s8hVar;
        this.d = s8hVar2;
        this.e = str;
        this.f = i3;
        this.g = i4;
        this.h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omg)) {
            return false;
        }
        omg omgVar = (omg) obj;
        return this.f25503a == omgVar.f25503a && this.b == omgVar.b && this.c.equals(omgVar.c) && this.d.equals(omgVar.d) && this.e.equals(omgVar.e) && this.f == omgVar.f && this.g == omgVar.g && this.h.equals(omgVar.h) && Intrinsics.d(this.i, omgVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(twn.a(this.g, twn.a(this.f, ua80.b((this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f25503a) * 31, 31)) * 31)) * 31, 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberDotaMatchesStatisticModel(id=", this.f25503a, ", tournamentId=", ", teamOne=", this.b);
        sbT.append(this.c);
        sbT.append(", teamTwo=");
        sbT.append(this.d);
        sbT.append(", type=");
        twn.w(this.f, this.e, ", teamOneScore=", ", teamTwoScore=", sbT);
        kng0.w(this.g, ", startTime=", this.h, ", matches=", sbT);
        return dw9.r(sbT, this.i, Separators.RPAREN);
    }
}
