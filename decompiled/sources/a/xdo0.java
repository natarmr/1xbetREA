package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xdo0 implements zdo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40705a;
    public final boolean b;

    public xdo0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f40705a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdo0)) {
            return false;
        }
        xdo0 xdo0Var = (xdo0) obj;
        return Intrinsics.d(this.f40705a, xdo0Var.f40705a) && this.b == xdo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f40705a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f40705a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
