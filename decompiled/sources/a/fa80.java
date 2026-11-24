package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fa80 {
    public static final ea80 Companion = new ea80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9196a;

    public /* synthetic */ fa80(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f9196a = null;
        } else {
            this.f9196a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa80) && Intrinsics.d(this.f9196a, ((fa80) obj).f9196a);
    }

    public final int hashCode() {
        Integer num = this.f9196a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f9196a, "OrderedListAttributes(start=", Separators.RPAREN);
    }
}
