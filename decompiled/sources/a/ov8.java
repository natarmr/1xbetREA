package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ov8 implements rv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f25913a;
    public final mtl b;

    public ov8(i4 i4Var, mtl mtlVar) {
        i4Var.getClass();
        mtlVar.getClass();
        this.f25913a = i4Var;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov8)) {
            return false;
        }
        ov8 ov8Var = (ov8) obj;
        return Intrinsics.d(this.f25913a, ov8Var.f25913a) && Intrinsics.d(this.b, ov8Var.b);
    }

    public final int hashCode() {
        return this.b.f22376a.hashCode() + (this.f25913a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(filterItems=" + this.f25913a + ", dsBottomBarModel=" + this.b + Separators.RPAREN;
    }
}
