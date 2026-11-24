package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y7c0 implements b8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42145a;

    public y7c0(String str) {
        str.getClass();
        this.f42145a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7c0) && Intrinsics.d(this.f42145a, ((y7c0) obj).f42145a);
    }

    public final int hashCode() {
        return this.f42145a.hashCode() - 749194074;
    }

    public final String toString() {
        return kng0.l("Loader(id=CASHBACK, title=", this.f42145a, Separators.RPAREN);
    }
}
