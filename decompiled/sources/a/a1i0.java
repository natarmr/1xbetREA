package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a1i0 implements b1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71a;

    public a1i0(String str) {
        str.getClass();
        this.f71a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1i0) && Intrinsics.d(this.f71a, ((a1i0) obj).f71a);
    }

    public final int hashCode() {
        return this.f71a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCashbackChangedError(message=", this.f71a, Separators.RPAREN);
    }
}
