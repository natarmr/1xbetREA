package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class h740 {
    public static final e740 Companion = new e740();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12560a;

    public /* synthetic */ h740(int i, String str) {
        if ((i & 1) == 0) {
            this.f12560a = null;
        } else {
            this.f12560a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h740) && Intrinsics.d(this.f12560a, ((h740) obj).f12560a);
    }

    public final int hashCode() {
        String str = this.f12560a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MessageTypeDto(type=", this.f12560a, Separators.RPAREN);
    }
}
