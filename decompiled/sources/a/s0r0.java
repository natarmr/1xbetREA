package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f31423a;
    public final List b;

    public s0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f31423a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0r0)) {
            return false;
        }
        s0r0 s0r0Var = (s0r0) obj;
        return Intrinsics.d(this.f31423a, s0r0Var.f31423a) && Intrinsics.d(this.b, s0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31423a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesSpotlight(status=" + this.f31423a + ", value=" + this.b + Separators.RPAREN;
    }
}
