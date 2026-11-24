package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n0x implements o0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22722a;

    public n0x(String str) {
        str.getClass();
        this.f22722a = str;
    }

    @Override // a.o0x
    public final Integer b() {
        return null;
    }

    @Override // a.o0x
    public final bzw d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0x) && Intrinsics.d(this.f22722a, ((n0x) obj).f22722a);
    }

    public final int hashCode() {
        return this.f22722a.hashCode() * 961;
    }

    public final String toString() {
        return kng0.l("Url(url=", this.f22722a, ", blendMode=null, tintColor=null)");
    }
}
