package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vy30 implements wy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f38230a;
    public final int b;
    public final String c;

    public vy30(iz30 iz30Var, int i, String str) {
        this.f38230a = iz30Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy30)) {
            return false;
        }
        vy30 vy30Var = (vy30) obj;
        return this.f38230a == vy30Var.f38230a && this.b == vy30Var.b && Intrinsics.d(this.c, vy30Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f38230a.hashCode() * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @Override // a.wy30
    public final iz30 m() {
        return this.f38230a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XGamesClicked(menuItemModel=");
        sb.append(this.f38230a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", loadedPictureUrl=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
