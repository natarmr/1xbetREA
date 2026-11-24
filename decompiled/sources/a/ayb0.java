package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ayb0 {
    public static final zxb0 Companion = new zxb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9v0 f1664a;
    public final Integer b;

    public /* synthetic */ ayb0(int i, s9v0 s9v0Var, Integer num) {
        if ((i & 1) == 0) {
            this.f1664a = null;
        } else {
            this.f1664a = s9v0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayb0)) {
            return false;
        }
        ayb0 ayb0Var = (ayb0) obj;
        return Intrinsics.d(this.f1664a, ayb0Var.f1664a) && Intrinsics.d(this.b, ayb0Var.b);
    }

    public final int hashCode() {
        s9v0 s9v0Var = this.f1664a;
        int iHashCode = (s9v0Var == null ? 0 : s9v0Var.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PrizeResponse(bonus=" + this.f1664a + ", count=" + this.b + Separators.RPAREN;
    }
}
