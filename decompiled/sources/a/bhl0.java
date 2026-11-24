package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bhl0 implements ehl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2614a;

    public bhl0(String str) {
        str.getClass();
        this.f2614a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhl0) && Intrinsics.d(this.f2614a, ((bhl0) obj).f2614a);
    }

    public final int hashCode() {
        return this.f2614a.hashCode();
    }

    public final String toString() {
        return kng0.l("AllMarkets(label=", this.f2614a, Separators.RPAREN);
    }
}
