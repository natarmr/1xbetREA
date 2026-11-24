package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u32 implements x32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f34975a;
    public final List b;
    public final Set c;

    public u32(m32 m32Var, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f34975a = m32Var;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u32)) {
            return false;
        }
        u32 u32Var = (u32) obj;
        return this.f34975a == u32Var.f34975a && Intrinsics.d(this.b, u32Var.b) && Intrinsics.d(this.c, u32Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f34975a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "History(status=" + this.f34975a + ", content=" + this.b + ", expandIds=" + this.c + Separators.RPAREN;
    }
}
