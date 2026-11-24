package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hcq0 implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f12837a;

    public hcq0(ThreadLocal threadLocal) {
        this.f12837a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcq0) && Intrinsics.d(this.f12837a, ((hcq0) obj).f12837a);
    }

    public final int hashCode() {
        return this.f12837a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f12837a + ')';
    }
}
