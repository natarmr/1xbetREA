package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iks0 f16686a;
    public final a4x b;
    public final boolean c;

    public jks0(iks0 iks0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f16686a = iks0Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jks0)) {
            return false;
        }
        jks0 jks0Var = (jks0) obj;
        return Intrinsics.d(this.f16686a, jks0Var.f16686a) && Intrinsics.d(this.b, jks0Var.b) && this.c == jks0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f16686a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersScreenStateUiModel(contentState=");
        sb.append(this.f16686a);
        sb.append(", itemsList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public jks0(hks0 hks0Var) {
        this(hks0Var, lak0.c, false);
    }
}
