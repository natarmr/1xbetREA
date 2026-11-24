package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zgb0 {
    public static final ygb0 Companion = new ygb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44337a;

    public /* synthetic */ zgb0(int i, String str) {
        if ((i & 1) == 0) {
            this.f44337a = null;
        } else {
            this.f44337a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgb0) && Intrinsics.d(this.f44337a, ((zgb0) obj).f44337a);
    }

    public final int hashCode() {
        String str = this.f44337a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("PopularPersonalizationConfigResponse(code=", this.f44337a, Separators.RPAREN);
    }
}
