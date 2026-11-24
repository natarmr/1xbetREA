package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oui0 implements pui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25879a;
    public final y3d b;
    public final o0x c;
    public final y3d d;
    public final uf5 e;

    public /* synthetic */ oui0(Integer num, y3d y3dVar, o0x o0xVar, y3d y3dVar2, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : y3dVar, o0xVar, (i & 8) != 0 ? null : y3dVar2, (uf5) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oui0)) {
            return false;
        }
        oui0 oui0Var = (oui0) obj;
        return Intrinsics.d(this.f25879a, oui0Var.f25879a) && Intrinsics.d(this.b, oui0Var.b) && Intrinsics.d(this.c, oui0Var.c) && Intrinsics.d(this.d, oui0Var.d) && Intrinsics.d(this.e, oui0Var.e);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Integer num = this.f25879a;
        int iHashCode3 = (num == null ? 0 : num.hashCode()) * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int iD = w6x.d(this.c, (iHashCode3 + iHashCode) * 31, 31);
        y3d y3dVar2 = this.d;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i = (iD + iHashCode2) * 31;
        uf5 uf5Var = this.e;
        return i + (uf5Var != null ? uf5Var.hashCode() : 0);
    }

    public final String toString() {
        return "S(placeholderResId=" + this.f25879a + ", placeholderColor=" + this.b + ", imageLink=" + this.c + ", imageTintColor=" + this.d + ", badgeStyle=" + this.e + Separators.RPAREN;
    }

    public oui0(Integer num, y3d y3dVar, o0x o0xVar, y3d y3dVar2, uf5 uf5Var) {
        o0xVar.getClass();
        this.f25879a = num;
        this.b = y3dVar;
        this.c = o0xVar;
        this.d = y3dVar2;
        this.e = uf5Var;
    }
}
