package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nax implements pax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23212a;

    public nax(String str) {
        str.getClass();
        this.f23212a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nax) && Intrinsics.d(this.f23212a, ((nax) obj).f23212a);
    }

    public final int hashCode() {
        return this.f23212a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBrowser(link=", this.f23212a, Separators.RPAREN);
    }
}
