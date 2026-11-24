package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class akr0 {
    public static final zjr0 Companion = new zjr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1036a;
    public final Integer b;

    public /* synthetic */ akr0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f1036a = null;
        } else {
            this.f1036a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akr0)) {
            return false;
        }
        akr0 akr0Var = (akr0) obj;
        return Intrinsics.d(this.f1036a, akr0Var.f1036a) && Intrinsics.d(this.b, akr0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f1036a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("TotoBetGameOutcomesResponse(outcome=", this.f1036a, ", bukPercentage=", this.b, Separators.RPAREN);
    }
}
