package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czc0 f40358a;
    public final boolean b;

    public x6c0(czc0 czc0Var, boolean z) {
        this.f40358a = czc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6c0)) {
            return false;
        }
        x6c0 x6c0Var = (x6c0) obj;
        return Intrinsics.d(this.f40358a, x6c0Var.f40358a) && this.b == x6c0Var.b;
    }

    public final int hashCode() {
        czc0 czc0Var = this.f40358a;
        return Boolean.hashCode(this.b) + ((czc0Var == null ? 0 : czc0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f40358a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
