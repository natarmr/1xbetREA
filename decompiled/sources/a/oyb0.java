package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class oyb0 {
    public static final nyb0 Companion = new nyb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26054a;
    public final String b;

    public /* synthetic */ oyb0(int i, int i2, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, myb0.f22596a.getDescriptor());
            throw null;
        }
        this.f26054a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyb0)) {
            return false;
        }
        oyb0 oyb0Var = (oyb0) obj;
        return this.f26054a == oyb0Var.f26054a && Intrinsics.d(this.b, oyb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f26054a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f26054a);
        sb.append(", uuid=");
        return axq.m(sb, this.b, ')');
    }

    public oyb0(int i, String str) {
        str.getClass();
        this.f26054a = i;
        this.b = str;
    }
}
