package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mn2 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f22069a;

    public mn2(a2n a2nVar) {
        a2nVar.getClass();
        this.f22069a = a2nVar;
    }

    @Override // a.on2
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn2) && Intrinsics.d(this.f22069a, ((mn2) obj).f22069a);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.f22069a.hashCode() * 31);
    }

    public final String toString() {
        return "Recommend(item=" + this.f22069a + ", spanSize=1)";
    }
}
