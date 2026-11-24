package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xmm implements zmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41133a;

    public xmm(String str) {
        str.getClass();
        this.f41133a = str;
    }

    @Override // a.zmm
    public final String a() {
        return this.f41133a;
    }

    @Override // a.zmm
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmm) && Intrinsics.d(this.f41133a, ((xmm) obj).f41133a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f41133a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("None(label=", this.f41133a, ", enableChangeCode=true)");
    }
}
