package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zp9 {
    public static final yp9 Companion = new yp9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f44748a;

    public /* synthetic */ zp9(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f44748a = null;
        } else {
            this.f44748a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp9) && Intrinsics.d(this.f44748a, ((zp9) obj).f44748a);
    }

    public final int hashCode() {
        Boolean bool = this.f44748a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "CallbackFeedbackResponse(success=" + this.f44748a + Separators.RPAREN;
    }
}
