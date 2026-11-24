package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s0n implements x0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0n f31417a;
    public final y0n b;
    public final mpm c;
    public final String d;
    public final r0n e;
    public final boolean f;

    public s0n(y0n y0nVar, y0n y0nVar2, mpm mpmVar, String str, r0n r0nVar, boolean z) {
        mpmVar.getClass();
        str.getClass();
        this.f31417a = y0nVar;
        this.b = y0nVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = r0nVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0n)) {
            return false;
        }
        s0n s0nVar = (s0n) obj;
        return this.f31417a.equals(s0nVar.f31417a) && this.b.equals(s0nVar.b) && Intrinsics.d(this.c, s0nVar.c) && Intrinsics.d(this.d, s0nVar.d) && this.e.equals(s0nVar.e) && this.f == s0nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f31417a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31);
    }

    public final String toString() {
        return "Default(firstOpponentModel=" + this.f31417a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + ", supportRtl=" + this.f + Separators.RPAREN;
    }
}
