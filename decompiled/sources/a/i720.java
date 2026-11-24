package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i720 implements l720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg7 f14270a;

    static {
        jg7 jg7Var = jg7.i;
    }

    public i720(jg7 jg7Var) {
        jg7Var.getClass();
        this.f14270a = jg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i720) && Intrinsics.d(this.f14270a, ((i720) obj).f14270a);
    }

    public final int hashCode() {
        return this.f14270a.hashCode();
    }

    public final String toString() {
        return "Data(headerData=" + this.f14270a + Separators.RPAREN;
    }
}
