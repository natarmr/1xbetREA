package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qvh {
    public static final pvh Companion = new pvh();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29386a;
    public final rwh b;

    static {
        pwh pwhVar = rwh.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new bmh((byte) 6)), null};
    }

    public /* synthetic */ qvh(int i, List list, rwh rwhVar) {
        if ((i & 1) == 0) {
            this.f29386a = null;
        } else {
            this.f29386a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = rwhVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvh)) {
            return false;
        }
        qvh qvhVar = (qvh) obj;
        return Intrinsics.d(this.f29386a, qvhVar.f29386a) && Intrinsics.d(this.b, qvhVar.b);
    }

    public final int hashCode() {
        List list = this.f29386a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        rwh rwhVar = this.b;
        return iHashCode + (rwhVar != null ? rwhVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyclingPlayerStatisticResponse(players=" + this.f29386a + ", response=" + this.b + Separators.RPAREN;
    }
}
