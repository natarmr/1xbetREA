package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class vrw {
    public static final urw Companion = new urw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37921a;

    public /* synthetic */ vrw(int i, String str) {
        if (1 == (i & 1)) {
            this.f37921a = str;
        } else {
            m2x.I(i, 1, trw.f34436a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrw) && Intrinsics.d(this.f37921a, ((vrw) obj).f37921a);
    }

    public final int hashCode() {
        String str = this.f37921a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Host(host=", this.f37921a, Separators.RPAREN);
    }
}
