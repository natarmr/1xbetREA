package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f7377a;
    public final cfq b;

    public e8k0(cfq cfqVar, Function1 function1) {
        this.f7377a = function1;
        this.b = cfqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8k0)) {
            return false;
        }
        e8k0 e8k0Var = (e8k0) obj;
        return Intrinsics.d(this.f7377a, e8k0Var.f7377a) && Intrinsics.d(this.b, e8k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7377a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f7377a + ", animationSpec=" + this.b + Separators.RPAREN;
    }
}
