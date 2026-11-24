package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bkr implements dkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2763a;

    public bkr(String str) {
        str.getClass();
        this.f2763a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkr) && Intrinsics.d(this.f2763a, ((bkr) obj).f2763a);
    }

    public final int hashCode() {
        return this.f2763a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f2763a, Separators.RPAREN);
    }
}
