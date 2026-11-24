package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f38366a;
    public final j83 b;
    public final String c;

    public w0s(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f38366a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0s)) {
            return false;
        }
        w0s w0sVar = (w0s) obj;
        return this.f38366a.equals(w0sVar.f38366a) && this.b.equals(w0sVar.b) && Intrinsics.d(this.c, w0sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f38366a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameCellUiModel(teamOneScore=");
        sb.append((Object) this.f38366a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", cellTitle=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
