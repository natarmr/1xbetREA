package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32504a;
    public final a4x b;

    public sno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f32504a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sno0)) {
            return false;
        }
        sno0 sno0Var = (sno0) obj;
        return this.f32504a == sno0Var.f32504a && Intrinsics.d(this.b, sno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f32504a) * 31);
    }

    public final String toString() {
        return "AccordeonCompactCards(scrollToTop=" + this.f32504a + ", items=" + this.b + Separators.RPAREN;
    }
}
