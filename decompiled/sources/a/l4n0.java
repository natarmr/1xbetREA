package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l4n0 {
    public static final g4n0 Companion = new g4n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19416a;

    public /* synthetic */ l4n0(int i, String str) {
        if ((i & 1) == 0) {
            this.f19416a = null;
        } else {
            this.f19416a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4n0) && Intrinsics.d(this.f19416a, ((l4n0) obj).f19416a);
    }

    public final int hashCode() {
        String str = this.f19416a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("SubTeamResponse(title=", this.f19416a, Separators.RPAREN);
    }
}
