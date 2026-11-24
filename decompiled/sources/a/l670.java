package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class l670 {
    public static final k670 Companion = new k670();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19493a;

    public /* synthetic */ l670(int i, String str) {
        if (1 == (i & 1)) {
            this.f19493a = str;
        } else {
            m2x.I(i, 1, j670.f15971a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l670) && Intrinsics.d(this.f19493a, ((l670) obj).f19493a);
    }

    public final int hashCode() {
        String str = this.f19493a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(title=", this.f19493a, Separators.RPAREN);
    }
}
