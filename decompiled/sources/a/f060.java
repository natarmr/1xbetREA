package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f060 implements i060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8704a;
    public final mtl b;

    public f060(a4x a4xVar, mtl mtlVar) {
        a4xVar.getClass();
        this.f8704a = a4xVar;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f060)) {
            return false;
        }
        f060 f060Var = (f060) obj;
        return Intrinsics.d(this.f8704a, f060Var.f8704a) && this.b.equals(f060Var.b);
    }

    public final int hashCode() {
        return this.b.f22376a.hashCode() + (this.f8704a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(orderList=" + this.f8704a + ", bottomBlock=" + this.b + Separators.RPAREN;
    }
}
