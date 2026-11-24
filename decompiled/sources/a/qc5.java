package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qc5 implements rc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28470a;
    public final n0x b;
    public final y3d c;

    public qc5(Integer num, n0x n0xVar, y3d y3dVar) {
        this.f28470a = num;
        this.b = n0xVar;
        this.c = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc5)) {
            return false;
        }
        qc5 qc5Var = (qc5) obj;
        return Intrinsics.d(this.f28470a, qc5Var.f28470a) && this.b.equals(qc5Var.b) && Intrinsics.d(this.c, qc5Var.c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f28470a;
        int iF = f140.f(this.b, (num == null ? 0 : num.hashCode()) * 31, 31);
        y3d y3dVar = this.c;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iF + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageBackground(placeholderIdRes=");
        sb.append(this.f28470a);
        sb.append(", imageLink=");
        sb.append(this.b);
        sb.append(", placeholderColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
