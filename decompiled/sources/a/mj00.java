package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcb f21871a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final g8l0 e;
    public final v5l0 f;
    public final boolean g;

    public mj00(wcb wcbVar, v5l0 v5l0Var, g8l0 g8l0Var, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f21871a = wcbVar;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = g8l0Var;
        this.f = v5l0Var;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj00)) {
            return false;
        }
        mj00 mj00Var = (mj00) obj;
        return Intrinsics.d(this.f21871a, mj00Var.f21871a) && Intrinsics.d(this.b, mj00Var.b) && this.c == mj00Var.c && this.d == mj00Var.d && this.e == mj00Var.e && this.f == mj00Var.f && this.g == mj00Var.g;
    }

    public final int hashCode() {
        wcb wcbVar = this.f21871a;
        return Boolean.hashCode(this.g) + axq.c(this.f, (this.e.hashCode() + brm0.e(brm0.e(dw9.a((wcbVar == null ? 0 : wcbVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressesScreenConfig(champImagesHolder=");
        sb.append(this.f21871a);
        sb.append(", specialEventList=");
        sb.append(this.b);
        sb.append(", isBettingDisabled=");
        ua80.u(", hasStream=", ", filterStyle=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", sportEventCardStyle=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
