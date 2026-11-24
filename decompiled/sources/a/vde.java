package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vde {
    public static final ude Companion = new ude();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37227a;
    public final tko0 b;

    static {
        pko0 pko0Var = tko0.Companion;
    }

    public /* synthetic */ vde(int i, String str, tko0 tko0Var) {
        if ((i & 1) == 0) {
            this.f37227a = null;
        } else {
            this.f37227a = str;
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
        if (!(obj instanceof vde)) {
            return false;
        }
        vde vdeVar = (vde) obj;
        return Intrinsics.d(this.f37227a, vdeVar.f37227a) && Intrinsics.d(this.b, vdeVar.b);
    }

    public final int hashCode() {
        String str = this.f37227a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tko0 tko0Var = this.b;
        return iHashCode + (tko0Var != null ? tko0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ContentByGroupResponse(groupTitle=" + this.f37227a + ", table=" + this.b + Separators.RPAREN;
    }
}
