package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jq10 implements kq10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16928a;
    public final boolean b;
    public final boolean c;

    public jq10(List list, boolean z, boolean z2) {
        list.getClass();
        this.f16928a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq10)) {
            return false;
        }
        jq10 jq10Var = (jq10) obj;
        return Intrinsics.d(this.f16928a, jq10Var.f16928a) && this.b == jq10Var.b && this.c == jq10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f16928a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(items=");
        sb.append(this.f16928a);
        sb.append(", buttonAvailable=");
        sb.append(this.b);
        sb.append(", forceUpdate=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
