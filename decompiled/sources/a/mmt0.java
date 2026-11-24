package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mmt0 {
    public static final lmt0 Companion = new lmt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22060a;
    public final Long b;

    public /* synthetic */ mmt0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f22060a = null;
        } else {
            this.f22060a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmt0)) {
            return false;
        }
        mmt0 mmt0Var = (mmt0) obj;
        return Intrinsics.d(this.f22060a, mmt0Var.f22060a) && Intrinsics.d(this.b, mmt0Var.b);
    }

    public final int hashCode() {
        String str = this.f22060a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateSlowModeResponse(chatId=" + this.f22060a + ", delaySec=" + this.b + Separators.RPAREN;
    }
}
