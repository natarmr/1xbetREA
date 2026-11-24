package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ql4 implements sl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f28915a;
    public final String b;

    public ql4(uu4 uu4Var, String str) {
        uu4Var.getClass();
        this.f28915a = uu4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql4)) {
            return false;
        }
        ql4 ql4Var = (ql4) obj;
        return Intrinsics.d(this.f28915a, ql4Var.f28915a) && this.b.equals(ql4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28915a.hashCode() * 31);
    }

    public final String toString() {
        return "Perform(authorizationData=" + this.f28915a + ", deviceId=" + this.b + Separators.RPAREN;
    }
}
