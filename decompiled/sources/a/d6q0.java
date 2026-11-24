package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d6q0 implements f6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f5563a;
    public final Integer b;
    public final y3d c;

    public d6q0(y3d y3dVar, o0x o0xVar, Integer num) {
        o0xVar.getClass();
        this.f5563a = o0xVar;
        this.b = num;
        this.c = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6q0)) {
            return false;
        }
        d6q0 d6q0Var = (d6q0) obj;
        return Intrinsics.d(this.f5563a, d6q0Var.f5563a) && Intrinsics.d(this.b, d6q0Var.b) && Intrinsics.d(this.c, d6q0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5563a.hashCode() * 31;
        int iHashCode2 = 0;
        Integer num = this.b;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar = this.c;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode2 = Long.hashCode(j);
        }
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(icon=");
        sb.append(this.f5563a);
        sb.append(", placeholderResId=");
        sb.append(this.b);
        sb.append(", tintColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
