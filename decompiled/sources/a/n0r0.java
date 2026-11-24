package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f22714a;
    public final List b;

    public n0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f22714a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0r0)) {
            return false;
        }
        n0r0 n0r0Var = (n0r0) obj;
        return Intrinsics.d(this.f22714a, n0r0Var.f22714a) && Intrinsics.d(this.b, n0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22714a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampsLive(status=" + this.f22714a + ", value=" + this.b + Separators.RPAREN;
    }
}
