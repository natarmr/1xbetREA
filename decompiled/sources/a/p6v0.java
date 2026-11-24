package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p6v0 {
    public static final o6v0 Companion = new o6v0();
    public static final a8z[] b = {maz.a(wez.f39042a, new o1u0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26477a;

    public /* synthetic */ p6v0(int i, List list) {
        if ((i & 1) == 0) {
            this.f26477a = null;
        } else {
            this.f26477a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6v0) && Intrinsics.d(this.f26477a, ((p6v0) obj).f26477a);
    }

    public final int hashCode() {
        List list = this.f26477a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f26477a, "WeeklyRewardResponse(daysInfo=", Separators.RPAREN);
    }
}
