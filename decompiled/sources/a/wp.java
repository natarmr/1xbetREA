package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wp {
    public static final vp Companion = new vp();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new q8(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39521a;
    public final List b;

    public /* synthetic */ wp(int i, long j, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, up.f36036a.getDescriptor());
            throw null;
        }
        this.f39521a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return this.f39521a == wpVar.f39521a && Intrinsics.d(this.b, wpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39521a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f39521a, "AddBetSubscriptionRequest(currencyAccId=", ", betIds=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public wp(long j, List list) {
        list.getClass();
        this.f39521a = j;
        this.b = list;
    }
}
