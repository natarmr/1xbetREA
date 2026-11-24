package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j9p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16149a;
    public final vb90 b;

    public j9p0(String str, vb90 vb90Var) {
        str.getClass();
        this.f16149a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9p0)) {
            return false;
        }
        j9p0 j9p0Var = (j9p0) obj;
        return Intrinsics.d(this.f16149a, j9p0Var.f16149a) && this.b.equals(j9p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16149a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16149a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsGameCardUiModel(key=" + this.f16149a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
