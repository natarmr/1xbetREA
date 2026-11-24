package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zbx {
    public static final ybx Companion = new ybx();
    public static final a8z[] b = {maz.a(wez.f39042a, new kdw(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44139a;

    public /* synthetic */ zbx(int i, List list) {
        if ((i & 1) == 0) {
            this.f44139a = null;
        } else {
            this.f44139a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbx) && Intrinsics.d(this.f44139a, ((zbx) obj).f44139a);
    }

    public final int hashCode() {
        List list = this.f44139a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44139a, "InjuriesListResponse(injuries=", Separators.RPAREN);
    }
}
