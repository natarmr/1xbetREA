package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class id80 implements kd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14571a;
    public final boolean b;

    public id80(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f14571a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id80)) {
            return false;
        }
        id80 id80Var = (id80) obj;
        return Intrinsics.d(this.f14571a, id80Var.f14571a) && this.b == id80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f14571a.hashCode() * 31);
    }

    public final String toString() {
        return "Recommended(content=" + this.f14571a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
