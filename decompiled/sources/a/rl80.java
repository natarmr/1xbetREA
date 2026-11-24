package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rl80 implements am80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30684a;
    public final Throwable b;

    public rl80(Throwable th, List list) {
        list.getClass();
        this.f30684a = list;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl80)) {
            return false;
        }
        rl80 rl80Var = (rl80) obj;
        return Intrinsics.d(this.f30684a, rl80Var.f30684a) && this.b.equals(rl80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30684a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(pagingItems=" + this.f30684a + ", throwable=" + this.b + Separators.RPAREN;
    }
}
