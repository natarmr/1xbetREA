package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ibo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14499a;
    public final boolean b;
    public final g2v c;
    public final m7r0 d;
    public final wcb e;
    public final y78 f;
    public final List g;
    public final v5l0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public ibo0(String str, boolean z, g2v g2vVar, m7r0 m7r0Var, wcb wcbVar, y78 y78Var, List list, v5l0 v5l0Var, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        m7r0Var.getClass();
        wcbVar.getClass();
        list.getClass();
        v5l0Var.getClass();
        this.f14499a = str;
        this.b = z;
        this.c = g2vVar;
        this.d = m7r0Var;
        this.e = wcbVar;
        this.f = y78Var;
        this.g = list;
        this.h = v5l0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibo0)) {
            return false;
        }
        ibo0 ibo0Var = (ibo0) obj;
        return Intrinsics.d(this.f14499a, ibo0Var.f14499a) && this.b == ibo0Var.b && this.c.equals(ibo0Var.c) && this.d == ibo0Var.d && Intrinsics.d(this.e, ibo0Var.e) && this.f.equals(ibo0Var.f) && Intrinsics.d(this.g, ibo0Var.g) && this.h == ibo0Var.h && this.i == ibo0Var.i && this.j == ibo0Var.j && this.k == ibo0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(axq.c(this.h, dw9.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f14499a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("TabExtraDataModel(query=", this.f14499a, ", connected=", this.b, ", lottieEmptyConfigurator=");
        sbU.append(this.c);
        sbU.append(", tabType=");
        sbU.append(this.d);
        sbU.append(", champImagesHolder=");
        sbU.append(this.e);
        sbU.append(", gameUtilsProvider=");
        sbU.append(this.f);
        sbU.append(", specialEventList=");
        sbU.append(this.g);
        sbU.append(", sportEventCardStyle=");
        sbU.append(this.h);
        sbU.append(", bettingDisabled=");
        ua80.u(", hasStream=", ", supportRtl=", sbU, this.i, this.j);
        return rw2.p(sbU, this.k, Separators.RPAREN);
    }
}
