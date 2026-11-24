package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r1l0 implements u1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1l0 f29687a;
    public final y3d b;
    public final long c;
    public final String d;
    public final Integer e;
    public final y3d f;
    public final uf5 g;
    public final ope h;
    public final Integer i;

    public r1l0(p1l0 p1l0Var, y3d y3dVar, long j, String str, Integer num, y3d y3dVar2, uf5 uf5Var, gpe gpeVar, Integer num2) {
        this.f29687a = p1l0Var;
        this.b = y3dVar;
        this.c = j;
        this.d = str;
        this.e = num;
        this.f = y3dVar2;
        this.g = uf5Var;
        this.h = gpeVar;
        this.i = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1l0)) {
            return false;
        }
        r1l0 r1l0Var = (r1l0) obj;
        if (this.f29687a != r1l0Var.f29687a || !Intrinsics.d(this.b, r1l0Var.b)) {
            return false;
        }
        long j = r1l0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, r1l0Var.d) && Intrinsics.d(this.e, r1l0Var.e) && Intrinsics.d(this.f, r1l0Var.f) && Intrinsics.d(this.g, r1l0Var.g) && Intrinsics.d(this.h, r1l0Var.h) && Intrinsics.d(this.i, r1l0Var.i);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f29687a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode2 + iHashCode) * 31;
        int i2 = y3d.h;
        g2t0 g2t0Var2 = h2t0.b;
        int iB = rw2.b(i, 31, this.c);
        String str = this.d;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (y3dVar2 == null ? 0 : Long.hashCode(y3dVar2.f41946a))) * 31;
        uf5 uf5Var = this.g;
        int iHashCode6 = (iHashCode5 + (uf5Var == null ? 0 : uf5Var.hashCode())) * 31;
        ope opeVar = this.h;
        int iHashCode7 = (iHashCode6 + (opeVar == null ? 0 : opeVar.hashCode())) * 31;
        Integer num2 = this.i;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("BackgroundIcon(placeholderIcon=");
        sb.append(this.f29687a);
        sb.append(", placeHolderTint=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        f140.v(sb, strI, ", iconUrl=", this.d, ", iconResId=");
        sb.append(this.e);
        sb.append(", iconColor=");
        sb.append(this.f);
        sb.append(", badgeStyle=");
        sb.append(this.g);
        sb.append(", counterStyle=");
        sb.append(this.h);
        sb.append(", counterValue=");
        return dw9.q(sb, this.i, Separators.RPAREN);
    }
}
