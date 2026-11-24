package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jql0 extends lql0 {
    public final ke9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jql0(ke9 ke9Var) {
        super(ae9.b);
        ke9Var.getClass();
        this.b = ke9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jql0) && Intrinsics.d(this.b, ((jql0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ButtonFilter(model=" + this.b + Separators.RPAREN;
    }
}
