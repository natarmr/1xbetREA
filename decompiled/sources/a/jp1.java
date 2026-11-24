package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp1 f16878a;
    public final String b;

    public jp1(kp1 kp1Var, String str) {
        kp1Var.getClass();
        this.f16878a = kp1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1Var = (jp1) obj;
        return Intrinsics.d(this.f16878a, jp1Var.f16878a) && this.b.equals(jp1Var.b);
    }

    public final int hashCode() {
        this.f16878a.getClass();
        return this.b.hashCode() - 809947040;
    }

    public final String toString() {
        return "AggregatorSlotsTipModel(screen=" + this.f16878a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
