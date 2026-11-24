package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class u85 {
    public static final t85 Companion = new t85();
    public static final a8z[] b = {maz.a(wez.f39042a, new o85(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35219a;

    public /* synthetic */ u85(int i, List list) {
        if ((i & 1) == 0) {
            this.f35219a = null;
        } else {
            this.f35219a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u85) && Intrinsics.d(this.f35219a, ((u85) obj).f35219a);
    }

    public final int hashCode() {
        List list = this.f35219a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f35219a, "AvailableTasksResponse(tasks=", Separators.RPAREN);
    }
}
