package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mfp0 {
    public static final lfp0 Companion = new lfp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21705a;
    public final String b;

    public /* synthetic */ mfp0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f21705a = null;
        } else {
            this.f21705a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfp0)) {
            return false;
        }
        mfp0 mfp0Var = (mfp0) obj;
        return Intrinsics.d(this.f21705a, mfp0Var.f21705a) && Intrinsics.d(this.b, mfp0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f21705a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f21705a, "TeamMenuItemResponse(type=", ", name=", this.b, Separators.RPAREN);
    }
}
