package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nls0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f23743a;
    public final qe60 b;

    public nls0(j83 j83Var, qe60 qe60Var) {
        this.f23743a = j83Var;
        this.b = qe60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nls0)) {
            return false;
        }
        nls0 nls0Var = (nls0) obj;
        return Intrinsics.d(this.f23743a, nls0Var.f23743a) && this.b.equals(nls0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23743a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f23743a) + ", offsetMapping=" + this.b + Separators.RPAREN;
    }
}
