package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lqp0 {
    public static final kqp0 Companion = new kqp0();
    public static final a8z[] b = {maz.a(wez.f39042a, new mhp0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20497a;

    public /* synthetic */ lqp0(int i, List list) {
        if ((i & 1) == 0) {
            this.f20497a = null;
        } else {
            this.f20497a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqp0) && Intrinsics.d(this.f20497a, ((lqp0) obj).f20497a);
    }

    public final int hashCode() {
        List list = this.f20497a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f20497a, "TeamsResponse(teams=", Separators.RPAREN);
    }
}
