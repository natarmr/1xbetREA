package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xeg0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kfg0 f40745a;
    public final int b;
    public final List c;
    public final int d;

    public xeg0(kfg0 kfg0Var, int i, List list, int i2) {
        list.getClass();
        this.f40745a = kfg0Var;
        this.b = i;
        this.c = list;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeg0)) {
            return false;
        }
        xeg0 xeg0Var = (xeg0) obj;
        return this.f40745a == xeg0Var.f40745a && this.b == xeg0Var.b && Intrinsics.d(this.c, xeg0Var.c) && this.d == xeg0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dw9.a(twn.a(this.b, this.f40745a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "RouletteModel(rouletteType=" + this.f40745a + ", animationValue=" + this.b + ", allValuesOfGame=" + this.c + ", currentValue=" + this.d + Separators.RPAREN;
    }
}
