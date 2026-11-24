package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41304a;
    public final List b;

    public xq9(long j, List list) {
        list.getClass();
        this.f41304a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq9)) {
            return false;
        }
        xq9 xq9Var = (xq9) obj;
        return this.f41304a == xq9Var.f41304a && Intrinsics.d(this.b, xq9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f41304a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f41304a, "CallbackHistoryModel(dateInMs=", ", history=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
