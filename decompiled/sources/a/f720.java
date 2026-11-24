package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f720 implements l720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg7 f9039a;

    static {
        jg7 jg7Var = jg7.i;
    }

    public f720(jg7 jg7Var) {
        jg7Var.getClass();
        this.f9039a = jg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f720) && Intrinsics.d(this.f9039a, ((f720) obj).f9039a);
    }

    public final int hashCode() {
        return this.f9039a.hashCode();
    }

    public final String toString() {
        return "Blocked(headerData=" + this.f9039a + Separators.RPAREN;
    }
}
