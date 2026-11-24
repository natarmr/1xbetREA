package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wsc0 implements xsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39684a;

    public wsc0(String str) {
        str.getClass();
        this.f39684a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsc0) && Intrinsics.d(this.f39684a, ((wsc0) obj).f39684a);
    }

    public final int hashCode() {
        return this.f39684a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(accountInfoLabel=", this.f39684a, Separators.RPAREN);
    }
}
