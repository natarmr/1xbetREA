package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jas {
    public static final ias Companion = new ias();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f16206a;

    public /* synthetic */ jas(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f16206a = null;
        } else {
            this.f16206a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jas) && Intrinsics.d(this.f16206a, ((jas) obj).f16206a);
    }

    public final int hashCode() {
        Boolean bool = this.f16206a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "GameEventKabaddiInfoResponse(important=" + this.f16206a + Separators.RPAREN;
    }
}
