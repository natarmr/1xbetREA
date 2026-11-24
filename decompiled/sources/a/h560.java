package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h560 implements i560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12465a;

    public h560(String str) {
        str.getClass();
        this.f12465a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h560) && Intrinsics.d(this.f12465a, ((h560) obj).f12465a);
    }

    public final int hashCode() {
        return this.f12465a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnUrlReceived(url=", this.f12465a, Separators.RPAREN);
    }
}
