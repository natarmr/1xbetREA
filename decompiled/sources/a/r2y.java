package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r2y {
    public static final p2y Companion = new p2y();
    public static final a8z[] b = {maz.a(wez.f39042a, new qgx(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29761a;

    public /* synthetic */ r2y(int i, List list) {
        if ((i & 1) == 0) {
            this.f29761a = null;
        } else {
            this.f29761a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2y) && Intrinsics.d(this.f29761a, ((r2y) obj).f29761a);
    }

    public final int hashCode() {
        List list = this.f29761a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29761a, "JackpotHistoryResponse(list=", Separators.RPAREN);
    }
}
