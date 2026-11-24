package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jam implements lam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9m f16196a;
    public final a4x b;
    public final String c;

    public jam(s9m s9mVar, a4x a4xVar, String str, int i) {
        str = (i & 4) != 0 ? null : str;
        a4xVar.getClass();
        this.f16196a = s9mVar;
        this.b = a4xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jam)) {
            return false;
        }
        jam jamVar = (jam) obj;
        return this.f16196a.equals(jamVar.f16196a) && Intrinsics.d(this.b, jamVar.b) && Intrinsics.d(this.c, jamVar.c);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f16196a.hashCode() * 31, 31);
        String str = this.c;
        return Integer.hashCode(5) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(headers=");
        sb.append(this.f16196a);
        sb.append(", rows=");
        sb.append(this.b);
        sb.append(", showAllButtonText=");
        return axq.n(sb, this.c, ", collapsedMaxRows=5)");
    }
}
