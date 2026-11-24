package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yd8 {
    public static final xd8 Companion = new xd8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42420a;

    public /* synthetic */ yd8(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f42420a = null;
        } else {
            this.f42420a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd8) && Intrinsics.d(this.f42420a, ((yd8) obj).f42420a);
    }

    public final int hashCode() {
        Integer num = this.f42420a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f42420a, "BonusCountDataResponse(count=", Separators.RPAREN);
    }
}
