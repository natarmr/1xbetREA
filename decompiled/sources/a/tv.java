package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tv implements xv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34574a;

    public tv(String str) {
        str.getClass();
        this.f34574a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && Intrinsics.d(this.f34574a, ((tv) obj).f34574a);
    }

    public final int hashCode() {
        return this.f34574a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnAddWalletClick(walletName=", this.f34574a, Separators.RPAREN);
    }
}
