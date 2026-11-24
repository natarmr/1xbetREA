package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gxs {
    public static final exs Companion = new exs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f12093a;
    public final String b;

    public /* synthetic */ gxs(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f12093a = null;
        } else {
            this.f12093a = bool;
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
        if (!(obj instanceof gxs)) {
            return false;
        }
        gxs gxsVar = (gxs) obj;
        return Intrinsics.d(this.f12093a, gxsVar.f12093a) && Intrinsics.d(this.b, gxsVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.f12093a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GameVideoResponse(enabled=" + this.f12093a + ", id=" + this.b + Separators.RPAREN;
    }
}
