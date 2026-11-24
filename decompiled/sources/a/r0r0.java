package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f29645a;
    public final List b;

    public r0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f29645a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0r0)) {
            return false;
        }
        r0r0 r0r0Var = (r0r0) obj;
        return Intrinsics.d(this.f29645a, r0r0Var.f29645a) && Intrinsics.d(this.b, r0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29645a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesCategories(status=" + this.f29645a + ", value=" + this.b + Separators.RPAREN;
    }
}
