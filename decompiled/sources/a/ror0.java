package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ror0 {
    public static final por0 Companion = new por0();
    public static final a8z[] b = {maz.a(wez.f39042a, new dfr0(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30852a;

    public /* synthetic */ ror0(int i, List list) {
        if ((i & 1) == 0) {
            this.f30852a = null;
        } else {
            this.f30852a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ror0) && Intrinsics.d(this.f30852a, ((ror0) obj).f30852a);
    }

    public final int hashCode() {
        List list = this.f30852a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30852a, "TotoHistoryResponse(totoHistoryList=", Separators.RPAREN);
    }
}
