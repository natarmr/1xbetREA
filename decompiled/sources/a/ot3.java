package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ot3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25812a;

    public ot3(String str) {
        str.getClass();
        this.f25812a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot3) && Intrinsics.d(this.f25812a, ((ot3) obj).f25812a);
    }

    public final int hashCode() {
        return this.f25812a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowPushInfoSnack(pushInfo=", this.f25812a, Separators.RPAREN);
    }
}
