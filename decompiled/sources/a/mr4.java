package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mr4 implements nr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22250a;

    public mr4(String str) {
        str.getClass();
        this.f22250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr4) && Intrinsics.d(this.f22250a, ((mr4) obj).f22250a);
    }

    public final int hashCode() {
        return this.f22250a.hashCode();
    }

    public final String toString() {
        return kng0.l("PushCode(code=", this.f22250a, Separators.RPAREN);
    }
}
