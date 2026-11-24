package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v32 implements x32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f36714a;
    public final List b;

    public v32(m32 m32Var, List list) {
        list.getClass();
        this.f36714a = m32Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v32)) {
            return false;
        }
        v32 v32Var = (v32) obj;
        return this.f36714a == v32Var.f36714a && Intrinsics.d(this.b, v32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36714a.hashCode() * 31);
    }

    public final String toString() {
        return "Line(status=" + this.f36714a + ", content=" + this.b + Separators.RPAREN;
    }
}
