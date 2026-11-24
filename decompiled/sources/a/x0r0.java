package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f40085a;
    public final List b;

    public x0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f40085a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0r0)) {
            return false;
        }
        x0r0 x0r0Var = (x0r0) obj;
        return Intrinsics.d(this.f40085a, x0r0Var.f40085a) && Intrinsics.d(this.b, x0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40085a.hashCode() * 31);
    }

    public final String toString() {
        return "SportGamesLive(status=" + this.f40085a + ", value=" + this.b + Separators.RPAREN;
    }
}
