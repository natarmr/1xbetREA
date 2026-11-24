package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mdd {
    public static final ldd Companion = new ldd();
    public static final a8z[] b = {maz.a(wez.f39042a, new a7d(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21591a;

    public /* synthetic */ mdd(int i, List list) {
        if ((i & 1) == 0) {
            this.f21591a = null;
        } else {
            this.f21591a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdd) && Intrinsics.d(this.f21591a, ((mdd) obj).f21591a);
    }

    public final int hashCode() {
        List list = this.f21591a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21591a, "CompetitorTypeResponse(options=", Separators.RPAREN);
    }
}
