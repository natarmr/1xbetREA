package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class a5s0 {
    public static final v4s0 Companion = new v4s0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yqr0(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287a;

    public /* synthetic */ a5s0(int i, List list) {
        if ((i & 1) == 0) {
            this.f287a = null;
        } else {
            this.f287a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5s0) && Intrinsics.d(this.f287a, ((a5s0) obj).f287a);
    }

    public final int hashCode() {
        List list = this.f287a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f287a, "TournamentResponse(options=", Separators.RPAREN);
    }
}
