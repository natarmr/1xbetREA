package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz7 f15720a;
    public final String b;

    public j18(yz7 yz7Var, String str) {
        str.getClass();
        this.f15720a = yz7Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j18)) {
            return false;
        }
        j18 j18Var = (j18) obj;
        return this.f15720a.equals(j18Var.f15720a) && Intrinsics.d(this.b, j18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15720a.hashCode() * 31);
    }

    public final String toString() {
        return "BigPigThrowItemUiModel(player=" + this.f15720a + ", numberOfThrow=" + this.b + Separators.RPAREN;
    }
}
