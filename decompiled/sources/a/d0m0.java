package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class d0m0 implements lwv0 {
    public static final c0m0 Companion = new c0m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5275a;
    public final long b;

    public /* synthetic */ d0m0(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, b0m0.f1771a.getDescriptor());
            throw null;
        }
        this.f5275a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0m0)) {
            return false;
        }
        d0m0 d0m0Var = (d0m0) obj;
        return Intrinsics.d(this.f5275a, d0m0Var.f5275a) && this.b == d0m0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f5275a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "StageNetBottomSheetRoute(title=", this.f5275a, ", sportId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public d0m0(String str, long j) {
        this.f5275a = str;
        this.b = j;
    }
}
