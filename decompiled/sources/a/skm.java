package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class skm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32357a;
    public final int b;
    public final boolean c;
    public final sa50 d;
    public final y3d e;
    public final y3d f;

    /* JADX WARN: Multi-variable type inference failed */
    public skm(int i, int i2, boolean z, y3d y3dVar, y3d y3dVar2) {
        this.f32357a = i;
        this.b = i2;
        this.c = z;
        this.d = ra50.f30118a;
        this.e = y3dVar;
        this.f = y3dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skm)) {
            return false;
        }
        skm skmVar = (skm) obj;
        return this.f32357a == skmVar.f32357a && this.b == skmVar.b && this.c == skmVar.c && Intrinsics.d(this.d, skmVar.d) && Intrinsics.d(this.e, skmVar.e) && Intrinsics.d(this.f, skmVar.f);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = (this.d.hashCode() + brm0.e(twn.a(this.b, Integer.hashCode(this.f32357a) * 31, 31), 31, this.c)) * 31;
        int iHashCode3 = 0;
        y3d y3dVar = this.e;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode2 + iHashCode) * 31;
        y3d y3dVar2 = this.f;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode3 = Long.hashCode(j2);
        }
        return i + iHashCode3;
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("DsNavigationBarBackgroundIconUiModel(buttonId=", this.f32357a, ", iconResId=", ", enabled=", this.b);
        sbT.append(this.c);
        sbT.append(", iconDecoration=");
        sbT.append(this.d);
        sbT.append(", iconCustomColor=");
        sbT.append(this.e);
        sbT.append(", backgroundCustomColor=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    public /* synthetic */ skm(int i, int i2, boolean z, y3d y3dVar, int i3) {
        this(i, i2, z, (y3d) null, (i3 & 32) != 0 ? null : y3dVar);
    }
}
