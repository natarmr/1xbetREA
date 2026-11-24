package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v0n implements x0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1n f36589a;
    public final b1n b;
    public final a2m c;
    public final boolean d;

    public v0n(b1n b1nVar, b1n b1nVar2, a2m a2mVar, boolean z) {
        a2mVar.getClass();
        this.f36589a = b1nVar;
        this.b = b1nVar2;
        this.c = a2mVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0n)) {
            return false;
        }
        v0n v0nVar = (v0n) obj;
        return this.f36589a.equals(v0nVar.f36589a) && this.b.equals(v0nVar.b) && Intrinsics.d(this.c, v0nVar.c) && this.d == v0nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rz4.a(this.c, (this.b.hashCode() + (this.f36589a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "V3(firstOpponentModel=" + this.f36589a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", supportRtl=" + this.d + Separators.RPAREN;
    }
}
