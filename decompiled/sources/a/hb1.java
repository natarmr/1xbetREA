package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12749a;

    public hb1(String str) {
        str.getClass();
        this.f12749a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb1) && Intrinsics.d(this.f12749a, ((hb1) obj).f12749a);
    }

    public final int hashCode() {
        return this.f12749a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowChangeBalanceDialog(subtitle=", this.f12749a, Separators.RPAREN);
    }
}
