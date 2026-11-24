package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czc0 f38619a;
    public final boolean b;

    public w6c0(czc0 czc0Var, boolean z) {
        this.f38619a = czc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c0)) {
            return false;
        }
        w6c0 w6c0Var = (w6c0) obj;
        return Intrinsics.d(this.f38619a, w6c0Var.f38619a) && this.b == w6c0Var.b;
    }

    public final int hashCode() {
        czc0 czc0Var = this.f38619a;
        return Boolean.hashCode(this.b) + ((czc0Var == null ? 0 : czc0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f38619a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
