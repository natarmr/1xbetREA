package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1l0 f31710a;
    public final String b;
    public final Integer c;
    public final y3d d;
    public final uf5 e;
    public final boolean f;
    public final Integer g;
    public final r1l0 h;
    public final q2l0 i;

    public s6l0(y1l0 y1l0Var, String str, Integer num, y3d y3dVar, uf5 uf5Var, boolean z, Integer num2, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        Integer num3 = (i & 4) != 0 ? null : num;
        y3d y3dVar2 = (i & 8) != 0 ? null : y3dVar;
        uf5 uf5Var2 = (i & 16) != 0 ? null : uf5Var;
        Integer num4 = (i & 64) != 0 ? null : num2;
        this.f31710a = y1l0Var;
        this.b = str2;
        this.c = num3;
        this.d = y3dVar2;
        this.e = uf5Var2;
        this.f = z;
        this.g = num4;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.h = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), str2, num3, y3dVar2, uf5Var2, num4 != null ? new gpe(s6t0.b().f33626a.getBackgroundContent()) : null, num4);
        this.i = new q2l0(new zb(null, null, 7), z);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.h;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6l0)) {
            return false;
        }
        s6l0 s6l0Var = (s6l0) obj;
        return this.f31710a.equals(s6l0Var.f31710a) && Intrinsics.d(this.b, s6l0Var.b) && Intrinsics.d(this.c, s6l0Var.c) && Intrinsics.d(this.d, s6l0Var.d) && Intrinsics.d(this.e, s6l0Var.e) && this.f == s6l0Var.f && Intrinsics.d(this.g, s6l0Var.g);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f31710a;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f31710a.hashCode() * 31;
        String str = this.b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar = this.d;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode4 + iHashCode) * 31;
        uf5 uf5Var = this.e;
        int iE = brm0.e((i + (uf5Var == null ? 0 : uf5Var.hashCode())) * 31, 31, this.f);
        Integer num2 = this.g;
        return iE + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithAccordion(title=");
        sb.append(this.f31710a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconResId=");
        sb.append(this.c);
        sb.append(", iconColor=");
        sb.append(this.d);
        sb.append(", badgeStyle=");
        sb.append(this.e);
        sb.append(", expanded=");
        sb.append(this.f);
        sb.append(", iconCounterValue=");
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
