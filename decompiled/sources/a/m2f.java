package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2f implements o2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21055a;

    public m2f(String str) {
        str.getClass();
        this.f21055a = str;
    }

    @Override // a.o2f
    public final String a() {
        return this.f21055a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2f) && Intrinsics.d(this.f21055a, ((m2f) obj).f21055a);
    }

    public final int hashCode() {
        return this.f21055a.hashCode();
    }

    public final String toString() {
        return kng0.l("Bet(segmentTitle=", this.f21055a, Separators.RPAREN);
    }
}
