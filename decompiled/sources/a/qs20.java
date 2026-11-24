package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qs20 implements rs20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29239a;
    public final String b;
    public final boolean c;

    public qs20(String str, long j, boolean z) {
        str.getClass();
        this.f29239a = j;
        this.b = str;
        this.c = z;
    }

    @Override // a.rs20
    public final long a() {
        return this.f29239a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs20)) {
            return false;
        }
        qs20 qs20Var = (qs20) obj;
        return this.f29239a == qs20Var.f29239a && Intrinsics.d(this.b, qs20Var.b) && this.c == qs20Var.c;
    }

    @Override // a.rs20
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f29239a) * 31, 31, this.b);
    }

    @Override // a.rs20
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        return f140.n(axq.o(this.f29239a, "Popular(marketTypeId=", ", name=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
