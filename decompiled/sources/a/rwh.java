package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rwh {
    public static final pwh Companion = new pwh();
    public static final a8z[] b = {maz.a(wez.f39042a, new bmh(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31216a;

    public /* synthetic */ rwh(int i, List list) {
        if ((i & 1) == 0) {
            this.f31216a = null;
        } else {
            this.f31216a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwh) && Intrinsics.d(this.f31216a, ((rwh) obj).f31216a);
    }

    public final int hashCode() {
        List list = this.f31216a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31216a, "CyclingResponse(results=", Separators.RPAREN);
    }
}
