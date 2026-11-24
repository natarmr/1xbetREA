package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p1t0 implements Comparable {
    public static final o1t0 b = new o1t0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26221a;

    public /* synthetic */ p1t0(byte b2) {
        this.f26221a = b2;
    }

    public static final /* synthetic */ p1t0 a(byte b2) {
        return new p1t0(b2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(this.f26221a & 255, ((p1t0) obj).f26221a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1t0) {
            return this.f26221a == ((p1t0) obj).f26221a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f26221a);
    }

    public final String toString() {
        return String.valueOf(this.f26221a & 255);
    }
}
