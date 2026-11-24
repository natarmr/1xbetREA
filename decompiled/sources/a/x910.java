package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/x910;", "La/um40;", "La/y910;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class x910 extends um40 {
    public final int b;
    public final int c;

    public x910(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x910)) {
            return false;
        }
        x910 x910Var = (x910) obj;
        return this.b == x910Var.b && this.c == x910Var.c;
    }

    @Override // a.um40
    public final lm40 f() {
        y910 y910Var = new y910();
        y910Var.o = this.b;
        y910Var.p = this.c;
        return y910Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        y910 y910Var = (y910) lm40Var;
        y910Var.getClass();
        y910Var.o = this.b;
        y910Var.p = this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return ohs0.m("LottieAnimationSizeElement(width=", this.b, ", height=", Separators.RPAREN, this.c);
    }
}
