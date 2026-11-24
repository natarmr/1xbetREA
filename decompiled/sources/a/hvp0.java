package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hvp0 {
    public static final gvp0 Companion = new gvp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13737a;

    public /* synthetic */ hvp0(int i, String str) {
        if ((i & 1) == 0) {
            this.f13737a = null;
        } else {
            this.f13737a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvp0) && Intrinsics.d(this.f13737a, ((hvp0) obj).f13737a);
    }

    public final int hashCode() {
        String str = this.f13737a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("TelegramBotLinkResponse(deepLink=", this.f13737a, Separators.RPAREN);
    }
}
