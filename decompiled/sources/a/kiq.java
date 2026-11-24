package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18348a;
    public final String b;
    public final long c;

    public kiq(String str, String str2, long j) {
        str.getClass();
        this.f18348a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiq)) {
            return false;
        }
        kiq kiqVar = (kiq) obj;
        if (!Intrinsics.d(this.f18348a, kiqVar.f18348a) || !this.b.equals(kiqVar.b)) {
            return false;
        }
        long j = kiqVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f18348a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("FixedGraphTeamUiModel(name=", this.f18348a, ", image=", this.b, ", color="), y3d.i(this.c), Separators.RPAREN);
    }
}
