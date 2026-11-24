package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iwp0 {
    public static final hwp0 Companion = new hwp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15502a;

    public /* synthetic */ iwp0(int i, String str) {
        if (1 == (i & 1)) {
            this.f15502a = str;
        } else {
            m2x.I(i, 1, gwp0.f12038a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwp0) && Intrinsics.d(this.f15502a, ((iwp0) obj).f15502a);
    }

    public final int hashCode() {
        return this.f15502a.hashCode();
    }

    public final String toString() {
        return kng0.l("TelegramUserPairRequest(tgUserToken=", this.f15502a, Separators.RPAREN);
    }

    public iwp0(String str) {
        str.getClass();
        this.f15502a = str;
    }
}
