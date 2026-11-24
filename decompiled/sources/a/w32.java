package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w32 implements x32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f38478a;
    public final List b;

    public w32(m32 m32Var, List list) {
        list.getClass();
        this.f38478a = m32Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w32)) {
            return false;
        }
        w32 w32Var = (w32) obj;
        return this.f38478a == w32Var.f38478a && Intrinsics.d(this.b, w32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38478a.hashCode() * 31);
    }

    public final String toString() {
        return "Live(status=" + this.f38478a + ", content=" + this.b + Separators.RPAREN;
    }
}
