package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f36595a;
    public final List b;

    public v0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f36595a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0r0)) {
            return false;
        }
        v0r0 v0r0Var = (v0r0) obj;
        return Intrinsics.d(this.f36595a, v0r0Var.f36595a) && Intrinsics.d(this.b, v0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36595a.hashCode() * 31);
    }

    public final String toString() {
        return "SportFilterTape(status=" + this.f36595a + ", value=" + this.b + Separators.RPAREN;
    }
}
