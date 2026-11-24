package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eto0 {
    public static final dto0 Companion = new dto0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8385a;

    public /* synthetic */ eto0(int i, String str) {
        if ((i & 1) == 0) {
            this.f8385a = null;
        } else {
            this.f8385a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eto0) && Intrinsics.d(this.f8385a, ((eto0) obj).f8385a);
    }

    public final int hashCode() {
        String str = this.f8385a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("TakePartResponse(refUrl=", this.f8385a, Separators.RPAREN);
    }
}
