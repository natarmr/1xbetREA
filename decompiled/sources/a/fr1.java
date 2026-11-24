package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fr1 extends lr1 {
    public final fs80 c;
    public final q91 d;

    public /* synthetic */ fr1(fs80 fs80Var, q91 q91Var, int i) {
        this((i & 1) != 0 ? new fs80(null, 0L, null, null, 0L, false, 127) : fs80Var, (i & 2) != 0 ? q91.f28325a : q91Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr1)) {
            return false;
        }
        fr1 fr1Var = (fr1) obj;
        return Intrinsics.d(this.c, fr1Var.c) && this.d == fr1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Categories(categoryToOpen=" + this.c + ", navigationSource=" + this.d + Separators.RPAREN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr1(fs80 fs80Var, q91 q91Var) {
        super(mr1.e, new am1(fs80Var, q91Var));
        fs80Var.getClass();
        q91Var.getClass();
        this.c = fs80Var;
        this.d = q91Var;
    }
}
