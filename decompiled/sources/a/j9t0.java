package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j9t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16157a;
    public final vb90 b;

    public j9t0(String str, vb90 vb90Var) {
        str.getClass();
        this.f16157a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9t0)) {
            return false;
        }
        j9t0 j9t0Var = (j9t0) obj;
        return Intrinsics.d(this.f16157a, j9t0Var.f16157a) && this.b.equals(j9t0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16157a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16157a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampGameCardUiModel(key=" + this.f16157a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
