package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ial0 implements jal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14444a;
    public final j5a0 b;

    public ial0(String str, j5a0 j5a0Var) {
        str.getClass();
        this.f14444a = str;
        this.b = j5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ial0)) {
            return false;
        }
        ial0 ial0Var = (ial0) obj;
        return Intrinsics.d(this.f14444a, ial0Var.f14444a) && this.b.equals(ial0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14444a.hashCode() * 31);
    }

    public final String toString() {
        return "Single(name=" + this.f14444a + ", playerLogo=" + this.b + Separators.RPAREN;
    }
}
