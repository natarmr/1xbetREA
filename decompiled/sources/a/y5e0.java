package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5e0 implements z5e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42042a;
    public final b6e0 b;

    public y5e0(String str, b6e0 b6e0Var) {
        str.getClass();
        this.f42042a = str;
        this.b = b6e0Var;
    }

    @Override // a.z5e0
    public final String a() {
        return this.f42042a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5e0)) {
            return false;
        }
        y5e0 y5e0Var = (y5e0) obj;
        return Intrinsics.d(this.f42042a, y5e0Var.f42042a) && this.b.equals(y5e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42042a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(screenTitle=" + this.f42042a + ", tableContent=" + this.b + Separators.RPAREN;
    }
}
