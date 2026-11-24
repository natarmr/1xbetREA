package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q2t0 implements Comparable {
    public static final p2t0 b = new p2t0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f28019a;

    public /* synthetic */ q2t0(short s) {
        this.f28019a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(this.f28019a & 65535, ((q2t0) obj).f28019a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q2t0) {
            return this.f28019a == ((q2t0) obj).f28019a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f28019a);
    }

    public final String toString() {
        return String.valueOf(this.f28019a & 65535);
    }
}
