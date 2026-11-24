package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mdm0 implements odm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21604a;
    public final zdx b;
    public final vfp0 c;
    public final vfp0 d;
    public final int e;
    public final int f;
    public final bom0 g;

    public mdm0(String str, zdx zdxVar, vfp0 vfp0Var, vfp0 vfp0Var2, int i, int i2, bom0 bom0Var) {
        str.getClass();
        bom0Var.getClass();
        this.f21604a = str;
        this.b = zdxVar;
        this.c = vfp0Var;
        this.d = vfp0Var2;
        this.e = i;
        this.f = i2;
        this.g = bom0Var;
    }

    @Override // a.odm0
    public final bom0 a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdm0)) {
            return false;
        }
        mdm0 mdm0Var = (mdm0) obj;
        return Intrinsics.d(this.f21604a, mdm0Var.f21604a) && this.b.equals(mdm0Var.b) && this.c.equals(mdm0Var.c) && this.d.equals(mdm0Var.d) && this.e == mdm0Var.e && this.f == mdm0Var.f && Intrinsics.d(this.g, mdm0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f21604a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Score(eventTitle=");
        sb.append(this.f21604a);
        sb.append(", scoreModel=");
        sb.append(this.b);
        sb.append(", teamOne=");
        sb.append(this.c);
        sb.append(", teamTwo=");
        sb.append(this.d);
        sb.append(", redCardTeamOne=");
        axq.r(this.e, this.f, ", redCardTeamTwo=", ", gameStatusModel=", sb);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
