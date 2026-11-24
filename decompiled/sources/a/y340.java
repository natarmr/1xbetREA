package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class y340 {
    public static final x340 Companion = new x340();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f41934a;

    public /* synthetic */ y340(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f41934a = null;
        } else {
            this.f41934a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y340) && Intrinsics.d(this.f41934a, ((y340) obj).f41934a);
    }

    public final int hashCode() {
        Boolean bool = this.f41934a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "MessageDeleteResponse(result=" + this.f41934a + Separators.RPAREN;
    }
}
