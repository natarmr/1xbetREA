package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class act0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9t0 f646a;
    public final a4x b;
    public final boolean c;

    public act0(d9t0 d9t0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f646a = d9t0Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof act0)) {
            return false;
        }
        act0 act0Var = (act0) obj;
        return Intrinsics.d(this.f646a, act0Var.f646a) && Intrinsics.d(this.b, act0Var.b) && this.c == act0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f646a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampScreenStateUiModel(contentState=");
        sb.append(this.f646a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public act0(d9t0 d9t0Var, a4x a4xVar, int i) {
        this(d9t0Var, (i & 2) != 0 ? lak0.c : a4xVar, false);
    }
}
