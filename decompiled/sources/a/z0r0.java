package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f43584a;
    public final List b;

    public z0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f43584a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0r0)) {
            return false;
        }
        z0r0 z0r0Var = (z0r0) obj;
        return Intrinsics.d(this.f43584a, z0r0Var.f43584a) && Intrinsics.d(this.b, z0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43584a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGames(status=" + this.f43584a + ", value=" + this.b + Separators.RPAREN;
    }
}
