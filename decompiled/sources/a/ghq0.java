package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ghq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f11314a;
    public final wgq0 b;

    public ghq0(ygq0 ygq0Var, wgq0 wgq0Var) {
        ygq0Var.getClass();
        wgq0Var.getClass();
        this.f11314a = ygq0Var;
        this.b = wgq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghq0)) {
            return false;
        }
        ghq0 ghq0Var = (ghq0) obj;
        return this.f11314a == ghq0Var.f11314a && Intrinsics.d(this.b, ghq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11314a.hashCode() * 31);
    }

    public final String toString() {
        return "TimeFilterHolder(timeFilter=" + this.f11314a + ", timePeriod=" + this.b + Separators.RPAREN;
    }
}
