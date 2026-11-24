package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class gq40 {
    public static final fq40 Companion = new fq40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11713a;

    public /* synthetic */ gq40(int i, String str) {
        if ((i & 1) == 0) {
            this.f11713a = null;
        } else {
            this.f11713a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq40) && Intrinsics.d(this.f11713a, ((gq40) obj).f11713a);
    }

    public final int hashCode() {
        String str = this.f11713a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MoneyTransferResponse(message=", this.f11713a, Separators.RPAREN);
    }
}
