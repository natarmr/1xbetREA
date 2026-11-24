package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ijo0 {
    public static final hjo0 Companion = new hjo0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14884a;
    public final tko0 b;

    static {
        pko0 pko0Var = tko0.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new dco0((byte) 8)), null};
    }

    public /* synthetic */ ijo0(int i, List list, tko0 tko0Var) {
        if ((i & 1) == 0) {
            this.f14884a = null;
        } else {
            this.f14884a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tko0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijo0)) {
            return false;
        }
        ijo0 ijo0Var = (ijo0) obj;
        return Intrinsics.d(this.f14884a, ijo0Var.f14884a) && Intrinsics.d(this.b, ijo0Var.b);
    }

    public final int hashCode() {
        List list = this.f14884a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        tko0 tko0Var = this.b;
        return iHashCode + (tko0Var != null ? tko0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TableContentResponse(contentWithGroup=" + this.f14884a + ", contentWithoutGroups=" + this.b + Separators.RPAREN;
    }
}
