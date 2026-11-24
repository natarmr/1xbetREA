package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p7v0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26526a;
    public final ioh b;

    public p7v0(String str, ioh iohVar) {
        str.getClass();
        this.f26526a = str;
        this.b = iohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7v0)) {
            return false;
        }
        p7v0 p7v0Var = (p7v0) obj;
        return Intrinsics.d(this.f26526a, p7v0Var.f26526a) && this.b.equals(p7v0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f26526a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26526a.hashCode() * 31);
    }

    public final String toString() {
        return "WeightClassRatingChampionUiModel(key=" + this.f26526a + ", model=" + this.b + Separators.RPAREN;
    }
}
