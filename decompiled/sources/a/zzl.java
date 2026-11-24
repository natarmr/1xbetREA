package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zzl implements b0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf5 f45260a;
    public final String b;
    public final long c;

    public zzl(tf5 tf5Var, String str, long j) {
        str.getClass();
        this.f45260a = tf5Var;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (!this.f45260a.equals(zzlVar.f45260a) || !Intrinsics.d(this.b, zzlVar.b)) {
            return false;
        }
        long j = zzlVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f45260a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("StatusWithSubtitle(status=");
        sb.append(this.f45260a);
        sb.append(", subTitle=");
        sb.append(this.b);
        sb.append(", subTitleTint=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
