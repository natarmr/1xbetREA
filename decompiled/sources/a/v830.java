package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class v830 implements z830 {
    public static final u830 Companion = new u830();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new n230(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa80 f36962a;
    public final List b;

    public /* synthetic */ v830(int i, fa80 fa80Var, List list) {
        if ((i & 1) == 0) {
            this.f36962a = null;
        } else {
            this.f36962a = fa80Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v830)) {
            return false;
        }
        v830 v830Var = (v830) obj;
        return Intrinsics.d(this.f36962a, v830Var.f36962a) && Intrinsics.d(this.b, v830Var.b);
    }

    public final int hashCode() {
        fa80 fa80Var = this.f36962a;
        int iHashCode = (fa80Var == null ? 0 : fa80Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "OrderedListContent(attrs=" + this.f36962a + ", content=" + this.b + Separators.RPAREN;
    }
}
