package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ps20 implements rs20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27494a;
    public final String b;
    public final boolean c;

    public ps20(String str, long j, boolean z) {
        str.getClass();
        this.f27494a = j;
        this.b = str;
        this.c = z;
    }

    @Override // a.rs20
    public final long a() {
        return this.f27494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps20)) {
            return false;
        }
        ps20 ps20Var = (ps20) obj;
        return this.f27494a == ps20Var.f27494a && Intrinsics.d(this.b, ps20Var.b) && this.c == ps20Var.c;
    }

    @Override // a.rs20
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f27494a) * 31, 31, this.b);
    }

    @Override // a.rs20
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        return f140.n(axq.o(this.f27494a, "OptionBet(marketTypeId=", ", name=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
