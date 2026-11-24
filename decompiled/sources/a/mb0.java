package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mb0 implements ob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21481a;

    public mb0(String str) {
        str.getClass();
        this.f21481a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb0) && Intrinsics.d(this.f21481a, ((mb0) obj).f21481a);
    }

    public final int hashCode() {
        return this.f21481a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowChangeBalanceDialog(dialogSubtitle=", this.f21481a, Separators.RPAREN);
    }
}
