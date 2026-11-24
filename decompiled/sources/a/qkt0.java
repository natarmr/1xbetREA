package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qkt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28903a;

    public qkt0(String str) {
        this.f28903a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkt0) && Intrinsics.d(this.f28903a, ((qkt0) obj).f28903a);
    }

    public final int hashCode() {
        String str = this.f28903a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateHistoryEvent(betId=", this.f28903a, Separators.RPAREN);
    }
}
