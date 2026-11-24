package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d260 implements f260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5342a;
    public final boolean b;

    public d260(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f5342a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d260)) {
            return false;
        }
        d260 d260Var = (d260) obj;
        return Intrinsics.d(this.f5342a, d260Var.f5342a) && this.b == d260Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5342a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(content=" + this.f5342a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
