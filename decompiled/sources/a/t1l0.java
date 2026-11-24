package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t1l0 implements u1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1l0 f33173a;
    public final y3d b;
    public final String c;
    public final Integer d;
    public final y3d e;
    public final uf5 f;
    public final ope g;
    public final Integer h;

    public /* synthetic */ t1l0(p1l0 p1l0Var, y3d y3dVar, String str, Integer num, y3d y3dVar2, uf5 uf5Var, int i) {
        this(p1l0Var, (i & 2) != 0 ? null : y3dVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : y3dVar2, (i & 32) != 0 ? null : uf5Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1l0)) {
            return false;
        }
        t1l0 t1l0Var = (t1l0) obj;
        return this.f33173a == t1l0Var.f33173a && Intrinsics.d(this.b, t1l0Var.b) && Intrinsics.d(this.c, t1l0Var.c) && Intrinsics.d(this.d, t1l0Var.d) && Intrinsics.d(this.e, t1l0Var.e) && Intrinsics.d(this.f, t1l0Var.f) && Intrinsics.d(this.g, t1l0Var.g) && Intrinsics.d(this.h, t1l0Var.h);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = this.f33173a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode3 + iHashCode) * 31;
        String str = this.c;
        int iHashCode4 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar2 = this.e;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i2 = (iHashCode5 + iHashCode2) * 31;
        uf5 uf5Var = this.f;
        int iHashCode6 = (i2 + (uf5Var == null ? 0 : uf5Var.hashCode())) * 31;
        ope opeVar = this.g;
        int iHashCode7 = (iHashCode6 + (opeVar == null ? 0 : opeVar.hashCode())) * 31;
        Integer num2 = this.h;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(placeholderIcon=");
        sb.append(this.f33173a);
        sb.append(", placeHolderTint=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        axq.x(this.d, this.c, ", iconResId=", ", iconColor=", sb);
        sb.append(this.e);
        sb.append(", badgeStyle=");
        sb.append(this.f);
        sb.append(", counterStyle=");
        sb.append(this.g);
        sb.append(", counterValue=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public t1l0(p1l0 p1l0Var, y3d y3dVar, String str, Integer num, y3d y3dVar2, uf5 uf5Var, gpe gpeVar, Integer num2) {
        this.f33173a = p1l0Var;
        this.b = y3dVar;
        this.c = str;
        this.d = num;
        this.e = y3dVar2;
        this.f = uf5Var;
        this.g = gpeVar;
        this.h = num2;
    }
}
