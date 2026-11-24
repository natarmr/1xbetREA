package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f40683a;
    public final j83 b;
    public final String c;

    public xd90(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f40683a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd90)) {
            return false;
        }
        xd90 xd90Var = (xd90) obj;
        return this.f40683a.equals(xd90Var.f40683a) && this.b.equals(xd90Var.b) && Intrinsics.d(this.c, xd90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f40683a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodCellUiModel(teamOneScore=");
        sb.append((Object) this.f40683a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
