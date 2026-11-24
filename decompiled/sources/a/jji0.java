package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jji0 {
    public static final iji0 Companion = new iji0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16619a;

    public /* synthetic */ jji0(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f16619a = null;
        } else {
            this.f16619a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jji0) && Intrinsics.d(this.f16619a, ((jji0) obj).f16619a);
    }

    public final int hashCode() {
        Integer num = this.f16619a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f16619a, "SessionDataResponse(unreadMessageCount=", Separators.RPAREN);
    }
}
