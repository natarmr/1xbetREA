package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nui0 implements pui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24149a;
    public final y3d b;
    public final o0x c;
    public final y3d d;
    public final y3d e;
    public final rc5 f;
    public final float g;

    public nui0(Integer num, y3d y3dVar, o0x o0xVar, y3d y3dVar2, y3d y3dVar3, rc5 rc5Var, float f, int i) {
        num = (i & 1) != 0 ? null : num;
        y3dVar = (i & 2) != 0 ? null : y3dVar;
        y3dVar2 = (i & 8) != 0 ? null : y3dVar2;
        y3dVar3 = (i & 16) != 0 ? null : y3dVar3;
        rc5Var = (i & 32) != 0 ? new pc5(null) : rc5Var;
        if ((i & 64) != 0) {
            zcl zclVar = qmk.f28987a;
            f = 360.0f;
        }
        this.f24149a = num;
        this.b = y3dVar;
        this.c = o0xVar;
        this.d = y3dVar2;
        this.e = y3dVar3;
        this.f = rc5Var;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nui0)) {
            return false;
        }
        nui0 nui0Var = (nui0) obj;
        return Intrinsics.d(this.f24149a, nui0Var.f24149a) && Intrinsics.d(this.b, nui0Var.b) && this.c.equals(nui0Var.c) && Intrinsics.d(this.d, nui0Var.d) && Intrinsics.d(this.e, nui0Var.e) && this.f.equals(nui0Var.f) && ycl.b(this.g, nui0Var.g);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        Integer num = this.f24149a;
        int iHashCode4 = (num == null ? 0 : num.hashCode()) * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int iD = w6x.d(this.c, (iHashCode4 + iHashCode) * 31, 31);
        y3d y3dVar2 = this.d;
        if (y3dVar2 == null) {
            iHashCode2 = 0;
        } else {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode2 = Long.hashCode(j2);
        }
        int i = (iD + iHashCode2) * 31;
        y3d y3dVar3 = this.e;
        if (y3dVar3 != null) {
            long j3 = y3dVar3.f41946a;
            g2t0 g2t0Var3 = h2t0.b;
            iHashCode3 = Long.hashCode(j3);
        }
        return defpackage.c.a((this.f.hashCode() + ((i + iHashCode3) * 31)) * 31, this.g, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.g);
        StringBuilder sb = new StringBuilder("BackgroundIcon(placeholderResId=");
        sb.append(this.f24149a);
        sb.append(", placeholderColor=");
        sb.append(this.b);
        sb.append(", imageLink=");
        sb.append(this.c);
        sb.append(", imageTintColor=");
        sb.append(this.d);
        sb.append(", imageStrokeColor=");
        sb.append(this.e);
        sb.append(", background=");
        sb.append(this.f);
        sb.append(", backgroundRadius=");
        return axq.n(sb, strC, ", badgeStyle=null)");
    }
}
