package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class g88 {
    public static final f88 Companion = new f88();
    public static final a8z[] b = {maz.a(wez.f39042a, new os7(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10853a;

    public /* synthetic */ g88(int i, List list) {
        if ((i & 1) == 0) {
            this.f10853a = null;
        } else {
            this.f10853a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g88) && Intrinsics.d(this.f10853a, ((g88) obj).f10853a);
    }

    public final int hashCode() {
        List list = this.f10853a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10853a, "BlockGameResponse(games=", Separators.RPAREN);
    }
}
