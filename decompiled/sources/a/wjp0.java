package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wjp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39275a;

    public wjp0(String str) {
        str.getClass();
        this.f39275a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjp0) && Intrinsics.d(this.f39275a, ((wjp0) obj).f39275a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f39275a;
    }

    public final int hashCode() {
        return this.f39275a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamShimmerUiItem(key=", this.f39275a, Separators.RPAREN);
    }
}
