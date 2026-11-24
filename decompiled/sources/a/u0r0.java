package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f34869a;
    public final List b;

    public u0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f34869a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0r0)) {
            return false;
        }
        u0r0 u0r0Var = (u0r0) obj;
        return Intrinsics.d(this.f34869a, u0r0Var.f34869a) && Intrinsics.d(this.b, u0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34869a.hashCode() * 31);
    }

    public final String toString() {
        return "SportChampsLive(status=" + this.f34869a + ", value=" + this.b + Separators.RPAREN;
    }
}
