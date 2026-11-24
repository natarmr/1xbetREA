package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16570a;
    public final String b;
    public final long c;

    public jie(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f16570a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jie)) {
            return false;
        }
        jie jieVar = (jie) obj;
        if (!Intrinsics.d(this.f16570a, jieVar.f16570a) || !Intrinsics.d(this.b, jieVar.b)) {
            return false;
        }
        long j = jieVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f16570a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("ContentTextSlotUiModel(title=", this.f16570a, ", description=", this.b, ", descriptionColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
