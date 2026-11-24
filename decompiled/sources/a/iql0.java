package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iql0 extends lql0 {
    public final ud9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iql0(ud9 ud9Var) {
        super(ae9.f717a);
        ud9Var.getClass();
        this.b = ud9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iql0) && Intrinsics.d(this.b, ((iql0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ButtonAll(model=" + this.b + Separators.RPAREN;
    }
}
