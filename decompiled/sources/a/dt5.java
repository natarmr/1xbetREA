package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dt5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f6645a;
    public final y3d b;
    public final Integer c;

    public dt5(y3d y3dVar, o0x o0xVar, Integer num) {
        o0xVar.getClass();
        this.f6645a = o0xVar;
        this.b = y3dVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt5)) {
            return false;
        }
        dt5 dt5Var = (dt5) obj;
        return Intrinsics.d(this.f6645a, dt5Var.f6645a) && Intrinsics.d(this.b, dt5Var.b) && this.c.equals(dt5Var.c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f6645a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return this.c.hashCode() + ((iHashCode2 + iHashCode) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerUiModel(image=");
        sb.append(this.f6645a);
        sb.append(", imageBackground=");
        sb.append(this.b);
        sb.append(", bannerSize=null, placeholderRes=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }
}
