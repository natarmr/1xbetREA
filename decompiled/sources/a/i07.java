package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class i07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13935a;
    public final e07 b;
    public final int c;
    public final ArrayList d;

    public i07(long j, e07 e07Var, int i, ArrayList arrayList) {
        this.f13935a = j;
        this.b = e07Var;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i07)) {
            return false;
        }
        i07 i07Var = (i07) obj;
        return this.f13935a == i07Var.f13935a && this.b.equals(i07Var.b) && this.c == i07Var.c && this.d.equals(i07Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (Long.hashCode(this.f13935a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "BetGroupUiModel(id=" + this.f13935a + ", header=" + this.b + ", columnCount=" + this.c + ", coefButtonList=" + this.d + Separators.RPAREN;
    }
}
