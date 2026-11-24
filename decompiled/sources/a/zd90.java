package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f44202a;
    public final j83 b;
    public final String c;

    public zd90(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f44202a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd90)) {
            return false;
        }
        zd90 zd90Var = (zd90) obj;
        return this.f44202a.equals(zd90Var.f44202a) && this.b.equals(zd90Var.b) && Intrinsics.d(this.c, zd90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f44202a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodCellUiModel(teamOneScore=");
        sb.append((Object) this.f44202a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
