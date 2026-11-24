package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o18 {
    public static final n18 Companion = new n18();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24467a;
    public final Integer b;

    public /* synthetic */ o18(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f24467a = null;
        } else {
            this.f24467a = num;
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
        if (!(obj instanceof o18)) {
            return false;
        }
        o18 o18Var = (o18) obj;
        return Intrinsics.d(this.f24467a, o18Var.f24467a) && Intrinsics.d(this.b, o18Var.b);
    }

    public final int hashCode() {
        Integer num = this.f24467a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("BigPigThrowResponse(firstDice=", this.f24467a, ", secondDice=", this.b, Separators.RPAREN);
    }
}
