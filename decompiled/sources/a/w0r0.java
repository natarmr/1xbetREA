package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f38365a;
    public final List b;

    public w0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f38365a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0r0)) {
            return false;
        }
        w0r0 w0r0Var = (w0r0) obj;
        return Intrinsics.d(this.f38365a, w0r0Var.f38365a) && Intrinsics.d(this.b, w0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38365a.hashCode() * 31);
    }

    public final String toString() {
        return "SportGamesLine(status=" + this.f38365a + ", value=" + this.b + Separators.RPAREN;
    }
}
