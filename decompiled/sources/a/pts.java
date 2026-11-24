package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27580a;
    public final List b;

    public pts(long j, List list) {
        list.getClass();
        this.f27580a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pts)) {
            return false;
        }
        pts ptsVar = (pts) obj;
        return this.f27580a == ptsVar.f27580a && Intrinsics.d(this.b, ptsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f27580a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f27580a, "GameSubscriptionSettingsModel(constId=", ", periodsSettings=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
