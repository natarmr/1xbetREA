package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jr1 extends lr1 {
    public final fvc0 c;

    public jr1(fvc0 fvc0Var) {
        super(mr1.f22247a, new jm1(fvc0Var));
        this.c = fvc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr1) && Intrinsics.d(this.c, ((jr1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Promo(promoTypeToOpen=" + this.c + Separators.RPAREN;
    }

    public /* synthetic */ jr1() {
        this(bvc0.f3273a);
    }
}
