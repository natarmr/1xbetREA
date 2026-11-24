package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fje0 implements ije0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9637a;
    public final boolean b;

    public fje0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f9637a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fje0)) {
            return false;
        }
        fje0 fje0Var = (fje0) obj;
        return Intrinsics.d(this.f9637a, fje0Var.f9637a) && this.b == fje0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9637a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(gameList=" + this.f9637a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
