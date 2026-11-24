package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jb00 extends kb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16214a;
    public final f9q0 b;
    public final sa4 c;

    public jb00(String str, f9q0 f9q0Var, sa4 sa4Var) {
        this.f16214a = str;
        this.b = f9q0Var;
        this.c = sa4Var;
    }

    @Override // a.kb00
    public final sa4 a() {
        return this.c;
    }

    @Override // a.kb00
    public final f9q0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb00)) {
            return false;
        }
        jb00 jb00Var = (jb00) obj;
        return Intrinsics.d(this.f16214a, jb00Var.f16214a) && Intrinsics.d(this.b, jb00Var.b) && Intrinsics.d(this.c, jb00Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f16214a.hashCode() * 31;
        f9q0 f9q0Var = this.b;
        int iHashCode2 = (iHashCode + (f9q0Var != null ? f9q0Var.hashCode() : 0)) * 31;
        sa4 sa4Var = this.c;
        return iHashCode2 + (sa4Var != null ? sa4Var.hashCode() : 0);
    }

    public final String toString() {
        return kng0.l("LinkAnnotation.Url(url=", this.f16214a, Separators.RPAREN);
    }
}
