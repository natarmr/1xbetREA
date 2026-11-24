package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class f7w {
    public static final e7w Companion = new e7w();
    public static final a8z[] b = {maz.a(wez.f39042a, new ldv(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9078a;

    public /* synthetic */ f7w(int i, List list) {
        if ((i & 1) == 0) {
            this.f9078a = null;
        } else {
            this.f9078a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7w) && Intrinsics.d(this.f9078a, ((f7w) obj).f9078a);
    }

    public final int hashCode() {
        List list = this.f9078a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9078a, "HistoryTasksResponse(tasks=", Separators.RPAREN);
    }
}
