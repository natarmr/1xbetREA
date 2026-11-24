package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z1l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43627a;
    public final long b;
    public final String c;
    public final y3d d;

    public z1l0(String str, long j, String str2, y3d y3dVar) {
        str.getClass();
        this.f43627a = str;
        this.b = j;
        this.c = str2;
        this.d = y3dVar;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f43627a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1l0)) {
            return false;
        }
        z1l0 z1l0Var = (z1l0) obj;
        if (!Intrinsics.d(this.f43627a, z1l0Var.f43627a)) {
            return false;
        }
        long j = z1l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, z1l0Var.c) && Intrinsics.d(this.d, z1l0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f43627a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iHashCode, 31, this.b);
        String str = this.c;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        y3d y3dVar = this.d;
        return iHashCode2 + (y3dVar != null ? Long.hashCode(y3dVar.f41946a) : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Static2Lines(titleText=", this.f43627a, ", titleColor=", y3d.i(this.b), ", subtitleText=");
        sbN.append(this.c);
        sbN.append(", subtitleColor=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public /* synthetic */ z1l0(String str, long j) {
        this(str, j, null, null);
    }
}
