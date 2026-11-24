package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23152a;
    public final int b;

    public n9p(String str, int i) {
        str.getClass();
        this.f23152a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f23152a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9p)) {
            return false;
        }
        n9p n9pVar = (n9p) obj;
        return Intrinsics.d(this.f23152a, n9pVar.f23152a) && this.b == n9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f23152a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Line(headerName=", this.f23152a, ", headerCounter=", Separators.RPAREN);
    }
}
