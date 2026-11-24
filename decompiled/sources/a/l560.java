package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l560 implements o560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19440a;

    public l560(String str) {
        str.getClass();
        this.f19440a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l560) && Intrinsics.d(this.f19440a, ((l560) obj).f19440a);
    }

    public final int hashCode() {
        return this.f19440a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f19440a, Separators.RPAREN);
    }
}
