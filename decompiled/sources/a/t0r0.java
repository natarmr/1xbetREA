package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f33134a;
    public final List b;

    public t0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f33134a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0r0)) {
            return false;
        }
        t0r0 t0r0Var = (t0r0) obj;
        return Intrinsics.d(this.f33134a, t0r0Var.f33134a) && Intrinsics.d(this.b, t0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33134a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesTape(status=" + this.f33134a + ", value=" + this.b + Separators.RPAREN;
    }
}
