package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gbe0 f12161a;
    public final o1x b;
    public final fz3 c;

    public gz3(gbe0 gbe0Var, o1x o1xVar, fz3 fz3Var) {
        this.f12161a = gbe0Var;
        this.b = o1xVar;
        this.c = fz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz3)) {
            return false;
        }
        gz3 gz3Var = (gz3) obj;
        if (this.f12161a != gz3Var.f12161a) {
            return false;
        }
        fz3 fz3Var = gz3Var.c;
        fz3 fz3Var2 = this.c;
        return Intrinsics.d(fz3Var2, fz3Var) && fz3Var2.a(this.b, gz3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f12161a.hashCode() * 31;
        fz3 fz3Var = this.c;
        return fz3Var.b(this.b) + ((fz3Var.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f12161a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + Separators.RPAREN;
    }
}
