package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s4g0 implements y4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31604a;
    public final boolean b;

    public s4g0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f31604a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4g0)) {
            return false;
        }
        s4g0 s4g0Var = (s4g0) obj;
        return Intrinsics.d(this.f31604a, s4g0Var.f31604a) && this.b == s4g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f31604a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f31604a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
