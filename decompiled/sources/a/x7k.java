package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x7k implements z7k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40417a;

    public x7k(String str) {
        str.getClass();
        this.f40417a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7k) && Intrinsics.d(this.f40417a, ((x7k) obj).f40417a);
    }

    public final int hashCode() {
        return this.f40417a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnDepositLimitValueChange(newValue=", this.f40417a, Separators.RPAREN);
    }
}
