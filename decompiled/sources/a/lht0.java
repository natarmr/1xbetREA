package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lht0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20074a;
    public final long b;
    public final boolean c;

    public lht0(String str, long j, boolean z) {
        str.getClass();
        this.f20074a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lht0)) {
            return false;
        }
        lht0 lht0Var = (lht0) obj;
        return Intrinsics.d(this.f20074a, lht0Var.f20074a) && this.b == lht0Var.b && this.c == lht0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f20074a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "UpdateChatEvent(chatId=", this.f20074a, ", slowModeDelaySec="), ", writeBlocked=", this.c, Separators.RPAREN);
    }
}
