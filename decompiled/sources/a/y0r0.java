package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f41823a;
    public final List b;

    public y0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f41823a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0r0)) {
            return false;
        }
        y0r0 y0r0Var = (y0r0) obj;
        return this.f41823a.equals(y0r0Var.f41823a) && Intrinsics.d(this.b, y0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41823a.hashCode() * 31);
    }

    public final String toString() {
        return "TopEvents(status=" + this.f41823a + ", value=" + this.b + Separators.RPAREN;
    }
}
