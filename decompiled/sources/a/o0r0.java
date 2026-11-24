package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f24442a;
    public final List b;

    public o0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f24442a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0r0)) {
            return false;
        }
        o0r0 o0r0Var = (o0r0) obj;
        return Intrinsics.d(this.f24442a, o0r0Var.f24442a) && Intrinsics.d(this.b, o0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24442a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberPopularLine(status=" + this.f24442a + ", value=" + this.b + Separators.RPAREN;
    }
}
