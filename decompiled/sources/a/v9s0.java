package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class v9s0 {
    public static final u9s0 Companion = new u9s0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yqr0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37050a;

    public /* synthetic */ v9s0(int i, List list) {
        if ((i & 1) == 0) {
            this.f37050a = null;
        } else {
            this.f37050a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9s0) && Intrinsics.d(this.f37050a, ((v9s0) obj).f37050a);
    }

    public final int hashCode() {
        List list = this.f37050a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37050a, "TournamentsPersonalInfoResponse(items=", Separators.RPAREN);
    }
}
