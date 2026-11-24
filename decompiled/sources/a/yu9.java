package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yu9 implements av9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh60 f43257a;
    public final skb0 b;

    public yu9(sh60 sh60Var, skb0 skb0Var) {
        sh60Var.getClass();
        skb0Var.getClass();
        this.f43257a = sh60Var;
        this.b = skb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu9)) {
            return false;
        }
        yu9 yu9Var = (yu9) obj;
        return this.f43257a == yu9Var.f43257a && Intrinsics.d(this.b, yu9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43257a.hashCode() * 31);
    }

    public final String toString() {
        return "OnNextStepOnboarding(onboarding=" + this.f43257a + ", currentStep=" + this.b + Separators.RPAREN;
    }
}
