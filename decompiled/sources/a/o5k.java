package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class o5k {
    public static final n5k Companion = new n5k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f24690a;

    public /* synthetic */ o5k(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f24690a = null;
        } else {
            this.f24690a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5k) && Intrinsics.d(this.f24690a, ((o5k) obj).f24690a);
    }

    public final int hashCode() {
        Boolean bool = this.f24690a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "DeletePopUpResponse(result=" + this.f24690a + Separators.RPAREN;
    }
}
