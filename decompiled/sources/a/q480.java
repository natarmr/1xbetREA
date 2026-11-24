package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q480 {
    public static final m480 Companion = new m480();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28085a;

    public /* synthetic */ q480(int i, String str) {
        if ((i & 1) == 0) {
            this.f28085a = null;
        } else {
            this.f28085a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q480) && Intrinsics.d(this.f28085a, ((q480) obj).f28085a);
    }

    public final int hashCode() {
        String str = this.f28085a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OpponentsResponse(fullName=", this.f28085a, Separators.RPAREN);
    }
}
