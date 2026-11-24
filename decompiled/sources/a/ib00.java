package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ib00 extends kb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14462a;
    public final f9q0 b;
    public final sa4 c;

    public ib00(String str, f9q0 f9q0Var, sa4 sa4Var) {
        this.f14462a = str;
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
        if (!(obj instanceof ib00)) {
            return false;
        }
        ib00 ib00Var = (ib00) obj;
        return Intrinsics.d(this.f14462a, ib00Var.f14462a) && Intrinsics.d(this.b, ib00Var.b) && Intrinsics.d(this.c, ib00Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f14462a.hashCode() * 31;
        f9q0 f9q0Var = this.b;
        int iHashCode2 = (iHashCode + (f9q0Var != null ? f9q0Var.hashCode() : 0)) * 31;
        sa4 sa4Var = this.c;
        return iHashCode2 + (sa4Var != null ? sa4Var.hashCode() : 0);
    }

    public final String toString() {
        return kng0.l("LinkAnnotation.Clickable(tag=", this.f14462a, Separators.RPAREN);
    }
}
