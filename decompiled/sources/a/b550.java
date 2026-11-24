package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b550 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1985a;
    public final c8r0 b;
    public final i4 c;
    public final mdm d;
    public final boolean e;

    public b550(String str, c8r0 c8r0Var, i4 i4Var, mdm mdmVar, boolean z) {
        str.getClass();
        i4Var.getClass();
        this.f1985a = str;
        this.b = c8r0Var;
        this.c = i4Var;
        this.d = mdmVar;
        this.e = z;
    }

    public static b550 a(b550 b550Var, c8r0 c8r0Var, i4 i4Var, boolean z, int i) {
        String str = b550Var.f1985a;
        if ((i & 2) != 0) {
            c8r0Var = b550Var.b;
        }
        c8r0 c8r0Var2 = c8r0Var;
        if ((i & 4) != 0) {
            i4Var = b550Var.c;
        }
        i4 i4Var2 = i4Var;
        mdm mdmVar = b550Var.d;
        if ((i & 16) != 0) {
            z = b550Var.e;
        }
        b550Var.getClass();
        str.getClass();
        i4Var2.getClass();
        return new b550(str, c8r0Var2, i4Var2, mdmVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b550)) {
            return false;
        }
        b550 b550Var = (b550) obj;
        return Intrinsics.d(this.f1985a, b550Var.f1985a) && this.b.equals(b550Var.b) && Intrinsics.d(this.c, b550Var.c) && this.d.equals(b550Var.d) && this.e == b550Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f140.d(this.d, f140.c(this.c, (this.b.hashCode() + (this.f1985a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyAggregatorOldUiState(title=");
        sb.append(this.f1985a);
        sb.append(", topItemUiModel=");
        sb.append(this.b);
        sb.append(", middleContent=");
        sb.append(this.c);
        sb.append(", emptyConfig=");
        sb.append(this.d);
        sb.append(", error=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
