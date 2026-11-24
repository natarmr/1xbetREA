package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f26168a;
    public final List b;

    public p0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f26168a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0r0)) {
            return false;
        }
        p0r0 p0r0Var = (p0r0) obj;
        return Intrinsics.d(this.f26168a, p0r0Var.f26168a) && Intrinsics.d(this.b, p0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26168a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberPopularLive(status=" + this.f26168a + ", value=" + this.b + Separators.RPAREN;
    }
}
