package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s2y {
    public static final q2y Companion = new q2y();
    public static final a8z[] b = {maz.a(wez.f39042a, new qgx(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31528a;

    public /* synthetic */ s2y(int i, List list) {
        if ((i & 1) == 0) {
            this.f31528a = null;
        } else {
            this.f31528a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2y) && Intrinsics.d(this.f31528a, ((s2y) obj).f31528a);
    }

    public final int hashCode() {
        List list = this.f31528a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31528a, "JackpotHistoryResponse(jackpotHistoryItemResponseList=", Separators.RPAREN);
    }
}
