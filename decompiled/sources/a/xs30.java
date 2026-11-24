package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xs30 {
    public static final ws30 Companion = new ws30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41396a;
    public final int b;
    public final String c;
    public final int d;

    public /* synthetic */ xs30(int i, int i2, int i3, int i4, String str) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, vs30.f37930a.getDescriptor());
            throw null;
        }
        this.f41396a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs30)) {
            return false;
        }
        xs30 xs30Var = (xs30) obj;
        return this.f41396a == xs30Var.f41396a && this.b == xs30Var.b && Intrinsics.d(this.c, xs30Var.c) && this.d == xs30Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(twn.a(this.b, Integer.hashCode(this.f41396a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return brm0.j(this.d, this.c, ", whence=", Separators.RPAREN, dw9.t("MemoryMakeStepRequest(actionNumber=", this.f41396a, ", indexCell=", ", lng=", this.b));
    }

    public xs30(int i, int i2, String str) {
        this.f41396a = i;
        this.b = i2;
        this.c = str;
        this.d = 22;
    }
}
