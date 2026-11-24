package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kr4 {
    public static final jr4 Companion = new jr4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f18748a;

    public /* synthetic */ kr4(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f18748a = null;
        } else {
            this.f18748a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr4) && Intrinsics.d(this.f18748a, ((kr4) obj).f18748a);
    }

    public final int hashCode() {
        Boolean bool = this.f18748a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "AuthenticatorPermissionResponse(blackListed=" + this.f18748a + Separators.RPAREN;
    }
}
