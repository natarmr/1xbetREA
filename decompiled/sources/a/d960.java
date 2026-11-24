package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d960 extends e960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5686a;

    public d960(String str) {
        str.getClass();
        this.f5686a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d960) && Intrinsics.d(this.f5686a, ((d960) obj).f5686a);
    }

    public final int hashCode() {
        return this.f5686a.hashCode();
    }

    public final String toString() {
        return kng0.l("Opened(number=", this.f5686a, Separators.RPAREN);
    }
}
