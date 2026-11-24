package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class po7 implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f27316a;

    public po7(a8q0 a8q0Var) {
        a8q0Var.getClass();
        this.f27316a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po7) && Intrinsics.d(this.f27316a, ((po7) obj).f27316a);
    }

    @Override // a.l7m0
    public final Object getValue() {
        return this.f27316a;
    }

    public final int hashCode() {
        return this.f27316a.hashCode();
    }

    public final String toString() {
        return "BetValueState(value=" + this.f27316a + Separators.RPAREN;
    }
}
