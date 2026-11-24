package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zo10 {
    public static final yo10 Companion = new yo10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44697a;

    public /* synthetic */ zo10(int i, String str) {
        if ((i & 1) == 0) {
            this.f44697a = null;
        } else {
            this.f44697a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo10) && Intrinsics.d(this.f44697a, ((zo10) obj).f44697a);
    }

    public final int hashCode() {
        String str = this.f44697a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MBlockResponse(state=", this.f44697a, Separators.RPAREN);
    }
}
