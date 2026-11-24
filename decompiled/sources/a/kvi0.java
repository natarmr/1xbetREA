package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18957a;
    public final y3d b;
    public final y3d c;

    public kvi0(String str, y3d y3dVar, y3d y3dVar2) {
        str.getClass();
        this.f18957a = str;
        this.b = y3dVar;
        this.c = y3dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvi0)) {
            return false;
        }
        kvi0 kvi0Var = (kvi0) obj;
        return Intrinsics.d(this.f18957a, kvi0Var.f18957a) && Intrinsics.d(this.b, kvi0Var.b) && Intrinsics.d(this.c, kvi0Var.c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f18957a.hashCode() * 31;
        int iHashCode3 = 0;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        int i = (iHashCode2 + iHashCode) * 31;
        y3d y3dVar2 = this.c;
        if (y3dVar2 != null) {
            long j2 = y3dVar2.f41946a;
            g2t0 g2t0Var2 = h2t0.b;
            iHashCode3 = Long.hashCode(j2);
        }
        return i + iHashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelChevron(labelText=");
        sb.append(this.f18957a);
        sb.append(", labelColor=");
        sb.append(this.b);
        sb.append(", chevronColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
