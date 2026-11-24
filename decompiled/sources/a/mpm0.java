package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fnf0 f22186a;
    public final boolean b;

    public mpm0(fnf0 fnf0Var, boolean z) {
        fnf0Var.getClass();
        this.f22186a = fnf0Var;
        this.b = z;
    }

    public static mpm0 a(mpm0 mpm0Var) {
        fnf0 fnf0Var = mpm0Var.f22186a;
        fnf0Var.getClass();
        return new mpm0(fnf0Var, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpm0)) {
            return false;
        }
        mpm0 mpm0Var = (mpm0) obj;
        return Intrinsics.d(this.f22186a, mpm0Var.f22186a) && this.b == mpm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22186a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestStateModel(requestKey=" + this.f22186a + ", isCompleted=" + this.b + Separators.RPAREN;
    }
}
