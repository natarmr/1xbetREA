package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tmc0 implements vmc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5c0 f34187a;

    public tmc0(w5c0 w5c0Var) {
        w5c0Var.getClass();
        this.f34187a = w5c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmc0) && Intrinsics.d(this.f34187a, ((tmc0) obj).f34187a);
    }

    public final int hashCode() {
        return this.f34187a.hashCode();
    }

    public final String toString() {
        return "Data(model=" + this.f34187a + Separators.RPAREN;
    }
}
