package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mlc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlc f21982a;
    public final glc b;

    public mlc(qlc qlcVar, glc glcVar) {
        qlcVar.getClass();
        this.f21982a = qlcVar;
        this.b = glcVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mlc) {
            return Intrinsics.d(this.f21982a, ((mlc) obj).f21982a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21982a.hashCode();
    }
}
