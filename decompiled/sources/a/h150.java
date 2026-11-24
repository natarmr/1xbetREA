package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12266a;

    public h150(String str) {
        str.getClass();
        this.f12266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h150) && Intrinsics.d(this.f12266a, ((h150) obj).f12266a);
    }

    public final int hashCode() {
        return this.f12266a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnClickJackpotWidget(key=", this.f12266a, Separators.RPAREN);
    }
}
