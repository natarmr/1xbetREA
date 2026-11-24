package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kct0 {
    public static final jct0 Companion = new jct0();
    public static final a8z[] b = {maz.a(wez.f39042a, new xns0(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18078a;

    public /* synthetic */ kct0(int i, List list) {
        if ((i & 1) == 0) {
            this.f18078a = null;
        } else {
            this.f18078a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kct0) && Intrinsics.d(this.f18078a, ((kct0) obj).f18078a);
    }

    public final int hashCode() {
        List list = this.f18078a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18078a, "InfoWrapper(info=", Separators.RPAREN);
    }
}
