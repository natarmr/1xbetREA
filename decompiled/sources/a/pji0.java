package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class pji0 {
    public static final oji0 Companion = new oji0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27093a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ pji0(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, nji0.f23639a.getDescriptor());
            throw null;
        }
        this.f27093a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pji0)) {
            return false;
        }
        pji0 pji0Var = (pji0) obj;
        return Intrinsics.d(this.f27093a, pji0Var.f27093a) && Intrinsics.d(this.b, pji0Var.b) && this.c == pji0Var.c && this.d == pji0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + twn.a(this.c, ua80.b(this.f27093a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f27093a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public pji0(int i, long j, String str, String str2) {
        this.f27093a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
