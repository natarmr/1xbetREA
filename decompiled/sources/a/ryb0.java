package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ryb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31306a;
    public final int b;
    public final int c;
    public final boolean d;

    public ryb0(int i, int i2, String str, boolean z) {
        str.getClass();
        this.f31306a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryb0)) {
            return false;
        }
        ryb0 ryb0Var = (ryb0) obj;
        return Intrinsics.d(this.f31306a, ryb0Var.f31306a) && this.b == ryb0Var.b && this.c == ryb0Var.c && this.d == ryb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f31306a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f31306a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return brm0.o(sb, this.d, ')');
    }
}
