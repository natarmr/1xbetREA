package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class is9 implements ks9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15292a;

    public is9(String str) {
        str.getClass();
        this.f15292a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is9) && Intrinsics.d(this.f15292a, ((is9) obj).f15292a);
    }

    public final int hashCode() {
        return this.f15292a.hashCode();
    }

    public final String toString() {
        return kng0.l("Header(title=", this.f15292a, Separators.RPAREN);
    }
}
