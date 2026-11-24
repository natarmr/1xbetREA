package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f21417a;
    public final String b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public m9m(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f21417a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9m)) {
            return false;
        }
        m9m m9mVar = (m9m) obj;
        return this.f21417a == m9mVar.f21417a && Intrinsics.d(this.b, m9mVar.b) && Intrinsics.d(this.c, m9mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f21417a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f21417a, "Default(id=", ", title=", this.b, ", value="), this.c, Separators.RPAREN);
    }
}
