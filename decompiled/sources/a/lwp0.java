package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lwp0 {
    public static final kwp0 Companion = new kwp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20775a;

    public /* synthetic */ lwp0(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f20775a = null;
        } else {
            this.f20775a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwp0) && Intrinsics.d(this.f20775a, ((lwp0) obj).f20775a);
    }

    public final int hashCode() {
        Integer num = this.f20775a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f20775a, "TelegramUserPairResponse(status=", Separators.RPAREN);
    }
}
