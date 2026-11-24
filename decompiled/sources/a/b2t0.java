package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b2t0 implements Comparable {
    public static final a2t0 b = new a2t0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1872a;

    public /* synthetic */ b2t0(int i) {
        this.f1872a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.f1872a ^ Integer.MIN_VALUE, ((b2t0) obj).f1872a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b2t0) {
            return this.f1872a == ((b2t0) obj).f1872a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1872a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f1872a) & 4294967295L);
    }
}
