package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yb9 {
    public static final xb9 Companion = new xb9();
    public static final a8z[] d = {maz.a(wez.f39042a, new ej8(14)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42331a;
    public final long b;
    public final long c;

    public /* synthetic */ yb9(int i, List list, long j, long j2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, wb9.f38864a.getDescriptor());
            throw null;
        }
        this.f42331a = list;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb9)) {
            return false;
        }
        yb9 yb9Var = (yb9) obj;
        return Intrinsics.d(this.f42331a, yb9Var.f42331a) && this.b == yb9Var.b && this.c == yb9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f42331a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderCouponRequest(games=");
        sb.append(this.f42331a);
        sb.append(", mainGameId=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", sportId=", Separators.RPAREN);
    }

    public yb9(long j, long j2, ArrayList arrayList) {
        this.f42331a = arrayList;
        this.b = j;
        this.c = j2;
    }
}
