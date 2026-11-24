package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vda0 f40684a;
    public final a4x b;
    public final boolean c;

    public xda0(vda0 vda0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f40684a = vda0Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xda0)) {
            return false;
        }
        xda0 xda0Var = (xda0) obj;
        return Intrinsics.d(this.f40684a, xda0Var.f40684a) && Intrinsics.d(this.b, xda0Var.b) && this.c == xda0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f40684a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerTransfersScreenStateUiModel(contentState=");
        sb.append(this.f40684a);
        sb.append(", itemsList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public xda0(uda0 uda0Var) {
        this(uda0Var, lak0.c, false);
    }
}
