package a;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lhq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f20069a;
    public a8f b = null;

    public lhq(CountDownLatch countDownLatch) {
        this.f20069a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhq)) {
            return false;
        }
        lhq lhqVar = (lhq) obj;
        return this.f20069a.equals(lhqVar.f20069a) && Intrinsics.d(this.b, lhqVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f20069a.hashCode() * 31;
        a8f a8fVar = this.b;
        return iHashCode + (a8fVar == null ? 0 : a8fVar.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.f20069a + ", subscriber=" + this.b + ')';
    }
}
