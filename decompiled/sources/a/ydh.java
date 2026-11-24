package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ydh {
    public static final xdh Companion = new xdh();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42437a;
    public final leh b;

    static {
        keh kehVar = leh.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new gch((byte) 1)), null};
    }

    public /* synthetic */ ydh(int i, List list, leh lehVar) {
        if ((i & 1) == 0) {
            this.f42437a = null;
        } else {
            this.f42437a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = lehVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydh)) {
            return false;
        }
        ydh ydhVar = (ydh) obj;
        return Intrinsics.d(this.f42437a, ydhVar.f42437a) && Intrinsics.d(this.b, ydhVar.b);
    }

    public final int hashCode() {
        List list = this.f42437a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        leh lehVar = this.b;
        return iHashCode + (lehVar != null ? lehVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberStageInternalTableInfoResponse(groups=" + this.f42437a + ", table=" + this.b + Separators.RPAREN;
    }
}
