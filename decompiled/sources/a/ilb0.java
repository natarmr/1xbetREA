package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ilb0 implements llb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skb0 f14969a;
    public final a4x b;

    public ilb0(skb0 skb0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f14969a = skb0Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilb0)) {
            return false;
        }
        ilb0 ilb0Var = (ilb0) obj;
        return this.f14969a == ilb0Var.f14969a && Intrinsics.d(this.b, ilb0Var.b);
    }

    public final int hashCode() {
        skb0 skb0Var = this.f14969a;
        return this.b.hashCode() + ((skb0Var == null ? 0 : skb0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Loaded(onboardingStep=" + this.f14969a + ", items=" + this.b + Separators.RPAREN;
    }
}
