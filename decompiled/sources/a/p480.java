package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p480 {
    public static final l480 Companion = new l480();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26340a;

    public /* synthetic */ p480(int i, String str) {
        if ((i & 1) == 0) {
            this.f26340a = null;
        } else {
            this.f26340a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p480) && Intrinsics.d(this.f26340a, ((p480) obj).f26340a);
    }

    public final int hashCode() {
        String str = this.f26340a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OpponentsResponse(fullName=", this.f26340a, Separators.RPAREN);
    }
}
