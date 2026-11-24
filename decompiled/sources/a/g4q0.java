package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class g4q0 {
    public static final f4q0 Companion = new f4q0();
    public static final a8z[] b = {maz.a(wez.f39042a, new ozp0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10681a;

    public /* synthetic */ g4q0(int i, List list) {
        if ((i & 1) == 0) {
            this.f10681a = null;
        } else {
            this.f10681a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4q0) && Intrinsics.d(this.f10681a, ((g4q0) obj).f10681a);
    }

    public final int hashCode() {
        List list = this.f10681a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10681a, "TextBroadcastsResponse(textBroadcasts=", Separators.RPAREN);
    }
}
