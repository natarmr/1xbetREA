package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f27449a;
    public final y3d b;
    public final ds5 c;
    public final Integer d;

    public pr5(o0x o0xVar, y3d y3dVar, ds5 ds5Var, Integer num) {
        this.f27449a = o0xVar;
        this.b = y3dVar;
        this.c = ds5Var;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr5)) {
            return false;
        }
        pr5 pr5Var = (pr5) obj;
        return this.f27449a.equals(pr5Var.f27449a) && Intrinsics.d(this.b, pr5Var.b) && Intrinsics.d(this.c, pr5Var.c) && this.d.equals(pr5Var.d);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f27449a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode2 + iHashCode) * 31;
        ds5 ds5Var = this.c;
        return this.d.hashCode() + ((i + (ds5Var != null ? Float.hashCode(ds5Var.f6595a) : 0)) * 31);
    }

    public final String toString() {
        return "BannerPresentUiModel(image=" + this.f27449a + ", imageBackground=" + this.b + ", bannerSize=" + this.c + ", placeholderRes=" + this.d + Separators.RPAREN;
    }
}
