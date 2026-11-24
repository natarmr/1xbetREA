package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wv implements xv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39814a;

    public wv(String str) {
        str.getClass();
        this.f39814a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv) && Intrinsics.d(this.f39814a, ((wv) obj).f39814a);
    }

    public final int hashCode() {
        return this.f39814a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWalletNameChanged(walletName=", this.f39814a, Separators.RPAREN);
    }
}
