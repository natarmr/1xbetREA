package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class woc0 implements cpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssc0 f39489a;

    public woc0(ssc0 ssc0Var) {
        ssc0Var.getClass();
        this.f39489a = ssc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof woc0) && Intrinsics.d(this.f39489a, ((woc0) obj).f39489a);
    }

    public final int hashCode() {
        return this.f39489a.hashCode();
    }

    public final String toString() {
        return "OnCategoryClick(category=" + this.f39489a + Separators.RPAREN;
    }
}
