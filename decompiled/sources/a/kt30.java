package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kt30 {
    public static final jt30 Companion = new jt30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18844a;
    public final String b;
    public final int c;

    public /* synthetic */ kt30(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, it30.f15336a.getDescriptor());
            throw null;
        }
        this.f18844a = i2;
        this.b = str;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt30)) {
            return false;
        }
        kt30 kt30Var = (kt30) obj;
        return this.f18844a == kt30Var.f18844a && Intrinsics.d(this.b, kt30Var.b) && this.c == kt30Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f18844a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f18844a, "MemoryStartGameRequest(sportId=", ", lng=", this.b, ", whence="));
    }

    public kt30(int i, String str) {
        this.f18844a = i;
        this.b = str;
        this.c = 22;
    }
}
