package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class via implements zia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37469a;

    public via(String str) {
        str.getClass();
        this.f37469a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof via) && Intrinsics.d(this.f37469a, ((via) obj).f37469a);
    }

    public final int hashCode() {
        return this.f37469a.hashCode();
    }

    public final String toString() {
        return kng0.l("AutoSubProtection(text=", this.f37469a, Separators.RPAREN);
    }
}
