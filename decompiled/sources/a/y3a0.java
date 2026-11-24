package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41942a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final bre f;
    public final String g;
    public final List h;

    public y3a0(String str, String str2, int i, int i2, String str3, bre breVar, String str4, List list) {
        list.getClass();
        this.f41942a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = breVar;
        this.g = str4;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3a0)) {
            return false;
        }
        y3a0 y3a0Var = (y3a0) obj;
        return this.f41942a.equals(y3a0Var.f41942a) && this.b.equals(y3a0Var.b) && this.c == y3a0Var.c && this.d == y3a0Var.d && this.e.equals(y3a0Var.e) && this.f.equals(y3a0Var.f) && this.g.equals(y3a0Var.g) && Intrinsics.d(this.h, y3a0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b((this.f.hashCode() + ua80.b(twn.a(this.d, twn.a(this.c, ua80.b(this.f41942a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerHeatMapModel(id=", this.f41942a, ", name=", this.b, ", translationId=");
        axq.r(this.c, this.d, ", number=", ", shortName=", sbN);
        sbN.append(this.e);
        sbN.append(", country=");
        sbN.append(this.f);
        sbN.append(", image=");
        return rw2.m(this.g, ", points=", Separators.RPAREN, sbN, this.h);
    }
}
