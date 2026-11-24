package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44731a;
    public final ndd b;

    public zot0(int i, odd oddVar) {
        oddVar.getClass();
        this.f44731a = i;
        this.b = oddVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zot0)) {
            return false;
        }
        zot0 zot0Var = (zot0) obj;
        return this.f44731a == zot0Var.f44731a && Intrinsics.d(this.b, zot0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f44731a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.f44731a + ", signal=" + this.b + ')';
    }
}
