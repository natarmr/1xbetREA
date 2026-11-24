package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class oht0 {
    public static final nht0 Companion = new nht0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25280a;
    public final Long b;
    public final Boolean c;

    public /* synthetic */ oht0(int i, Boolean bool, Long l, String str) {
        if ((i & 1) == 0) {
            this.f25280a = null;
        } else {
            this.f25280a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oht0)) {
            return false;
        }
        oht0 oht0Var = (oht0) obj;
        return Intrinsics.d(this.f25280a, oht0Var.f25280a) && Intrinsics.d(this.b, oht0Var.b) && Intrinsics.d(this.c, oht0Var.c);
    }

    public final int hashCode() {
        String str = this.f25280a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(kng0.s(this.b, "UpdateChatWSEvent(chatId=", this.f25280a, ", slowModeDelaySec=", ", writeBlocked="), this.c, Separators.RPAREN);
    }
}
