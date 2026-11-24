package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0b0 f6981a;
    public final String b;

    public e0b0(i0b0 i0b0Var, String str) {
        i0b0Var.getClass();
        this.f6981a = i0b0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0b0)) {
            return false;
        }
        e0b0 e0b0Var = (e0b0) obj;
        return Intrinsics.d(this.f6981a, e0b0Var.f6981a) && this.b.equals(e0b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6981a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularAggregatorTipModel(screen=" + this.f6981a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
