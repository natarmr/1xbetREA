package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wg80 implements elc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f39102a;

    public wg80(Class cls) {
        cls.getClass();
        this.f39102a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wg80) {
            return Intrinsics.d(this.f39102a, ((wg80) obj).f39102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39102a.hashCode();
    }

    @Override // a.elc
    public final Class j() {
        return this.f39102a;
    }

    public final String toString() {
        return this.f39102a.toString() + " (Kotlin reflection is not available)";
    }
}
