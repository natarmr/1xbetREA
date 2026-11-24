package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dvn0 implements fvn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f6753a;
    public final boolean b;
    public final mtl c;

    public dvn0(mtl mtlVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f6753a = a4xVar;
        this.b = z;
        this.c = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvn0)) {
            return false;
        }
        dvn0 dvn0Var = (dvn0) obj;
        return Intrinsics.d(this.f6753a, dvn0Var.f6753a) && this.b == dvn0Var.b && this.c.equals(dvn0Var.c);
    }

    public final int hashCode() {
        return this.c.f22376a.hashCode() + brm0.e(this.f6753a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Loaded(filters=" + this.f6753a + ", enableConfirmButton=" + this.b + ", bottomBarModel=" + this.c + Separators.RPAREN;
    }
}
