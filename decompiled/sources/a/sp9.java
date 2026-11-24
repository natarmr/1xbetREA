package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sp9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32580a;
    public final String b;

    public sp9(long j, String str) {
        this.f32580a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp9)) {
            return false;
        }
        sp9 sp9Var = (sp9) obj;
        return this.f32580a == sp9Var.f32580a && Intrinsics.d(this.b, sp9Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f32580a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32580a, "CallbackDeleteModel(requestIdToDelete=", ", requestGuidToDelete=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
