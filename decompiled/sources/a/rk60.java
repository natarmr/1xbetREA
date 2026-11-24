package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rk60 implements tk60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh60 f30634a;
    public final skb0 b;

    public rk60(sh60 sh60Var, skb0 skb0Var) {
        skb0Var.getClass();
        this.f30634a = sh60Var;
        this.b = skb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk60)) {
            return false;
        }
        rk60 rk60Var = (rk60) obj;
        return this.f30634a == rk60Var.f30634a && Intrinsics.d(this.b, rk60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30634a.hashCode() * 31);
    }

    public final String toString() {
        return "InProgress(onboarding=" + this.f30634a + ", step=" + this.b + Separators.RPAREN;
    }
}
