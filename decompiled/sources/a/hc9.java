package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hc9 {
    public static final gc9 Companion = new gc9();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ej8(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12809a;
    public final nb9 b;
    public final List c;

    public /* synthetic */ hc9(int i, long j, nb9 nb9Var, List list) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, fc9.f9300a.getDescriptor());
            throw null;
        }
        this.f12809a = j;
        this.b = nb9Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc9)) {
            return false;
        }
        hc9 hc9Var = (hc9) obj;
        return this.f12809a == hc9Var.f12809a && Intrinsics.d(this.b, hc9Var.b) && Intrinsics.d(this.c, hc9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f12809a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderGameRequest(gameId=");
        sb.append(this.f12809a);
        sb.append(", key=");
        sb.append(this.b);
        return ohs0.s(sb, ", events=", this.c, Separators.RPAREN);
    }

    public hc9(long j, nb9 nb9Var, ArrayList arrayList) {
        this.f12809a = j;
        this.b = nb9Var;
        this.c = arrayList;
    }
}
