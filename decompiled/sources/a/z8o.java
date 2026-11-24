package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43977a;
    public final w7o b;
    public final List c;
    public final sff0 d;
    public final boolean e;
    public final d8o f;
    public final boolean g;
    public final boolean h;

    public z8o(boolean z, w7o w7oVar, List list, sff0 sff0Var, boolean z2, d8o d8oVar, boolean z3, boolean z4) {
        list.getClass();
        this.f43977a = z;
        this.b = w7oVar;
        this.c = list;
        this.d = sff0Var;
        this.e = z2;
        this.f = d8oVar;
        this.g = z3;
        this.h = z4;
    }

    public static z8o a(z8o z8oVar, boolean z, w7o w7oVar, List list, d8o d8oVar, int i) {
        if ((i & 1) != 0) {
            z = z8oVar.f43977a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            w7oVar = z8oVar.b;
        }
        w7o w7oVar2 = w7oVar;
        if ((i & 4) != 0) {
            list = z8oVar.c;
        }
        List list2 = list;
        sff0 sff0Var = z8oVar.d;
        boolean z3 = z8oVar.e;
        if ((i & 32) != 0) {
            d8oVar = z8oVar.f;
        }
        boolean z4 = z8oVar.g;
        boolean z5 = z8oVar.h;
        z8oVar.getClass();
        list2.getClass();
        return new z8o(z2, w7oVar2, list2, sff0Var, z3, d8oVar, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8o)) {
            return false;
        }
        z8o z8oVar = (z8o) obj;
        return this.f43977a == z8oVar.f43977a && Intrinsics.d(this.b, z8oVar.b) && Intrinsics.d(this.c, z8oVar.c) && this.d.equals(z8oVar.d) && this.e == z8oVar.e && this.f.equals(z8oVar.f) && this.g == z8oVar.g && this.h == z8oVar.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f43977a) * 31;
        w7o w7oVar = this.b;
        return Boolean.hashCode(this.h) + brm0.e((this.f.hashCode() + brm0.e(cs0.c(this.d, dw9.a((iHashCode + (w7oVar == null ? 0 : w7oVar.hashCode())) * 31, 31, this.c), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsWorldCupStateModel(connected=");
        sb.append(this.f43977a);
        sb.append(", contentModel=");
        sb.append(this.b);
        sb.append(", socialMediaList=");
        sb.append(this.c);
        sb.append(", remoteConfigModel=");
        sb.append(this.d);
        sb.append(", bettingDisabled=");
        sb.append(this.e);
        sb.append(", disciplinesModel=");
        sb.append(this.f);
        sb.append(", tablet=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.g, this.h);
    }
}
