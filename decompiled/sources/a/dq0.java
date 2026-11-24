package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dq0 implements gq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtl f6490a;
    public final a4x b;

    public dq0(i4 i4Var, mtl mtlVar) {
        mtlVar.getClass();
        i4Var.getClass();
        this.f6490a = mtlVar;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        return Intrinsics.d(this.f6490a, dq0Var.f6490a) && Intrinsics.d(this.b, dq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6490a.f22376a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(dsBottomBarModel=" + this.f6490a + ", filterItems=" + this.b + Separators.RPAREN;
    }
}
