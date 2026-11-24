package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yih0 {
    public static final xih0 Companion = new xih0();
    public static final a8z[] b = {maz.a(wez.f39042a, new igh0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42691a;

    public /* synthetic */ yih0(int i, List list) {
        if ((i & 1) == 0) {
            this.f42691a = null;
        } else {
            this.f42691a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yih0) && Intrinsics.d(this.f42691a, ((yih0) obj).f42691a);
    }

    public final int hashCode() {
        List list = this.f42691a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42691a, "SeasonResponse(options=", Separators.RPAREN);
    }
}
