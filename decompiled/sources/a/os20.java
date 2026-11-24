package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class os20 implements rs20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25765a;
    public final String b;
    public final boolean c;

    public os20(String str, long j, boolean z) {
        str.getClass();
        this.f25765a = j;
        this.b = str;
        this.c = z;
    }

    @Override // a.rs20
    public final long a() {
        return this.f25765a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os20)) {
            return false;
        }
        os20 os20Var = (os20) obj;
        return this.f25765a == os20Var.f25765a && Intrinsics.d(this.b, os20Var.b) && this.c == os20Var.c;
    }

    @Override // a.rs20
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f25765a) * 31, 31, this.b);
    }

    @Override // a.rs20
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        return f140.n(axq.o(this.f25765a, "Default(marketTypeId=", ", name=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
