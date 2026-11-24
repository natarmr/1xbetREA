package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class myp {
    public static final lyp Companion = new lyp();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dfp(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uhi0 f22612a;
    public final List b;

    public /* synthetic */ myp(int i, uhi0 uhi0Var, List list) {
        if ((i & 1) == 0) {
            this.f22612a = null;
        } else {
            this.f22612a = uhi0Var;
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
        if (!(obj instanceof myp)) {
            return false;
        }
        myp mypVar = (myp) obj;
        return Intrinsics.d(this.f22612a, mypVar.f22612a) && Intrinsics.d(this.b, mypVar.b);
    }

    public final int hashCode() {
        uhi0 uhi0Var = this.f22612a;
        int iHashCode = (uhi0Var == null ? 0 : uhi0Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FighterStatsListResponse(error=" + this.f22612a + ", data=" + this.b + Separators.RPAREN;
    }
}
