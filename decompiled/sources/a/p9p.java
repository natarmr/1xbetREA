package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26618a;
    public final int b;

    public p9p(String str, int i) {
        str.getClass();
        this.f26618a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f26618a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9p)) {
            return false;
        }
        p9p p9pVar = (p9p) obj;
        return Intrinsics.d(this.f26618a, p9pVar.f26618a) && this.b == p9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f26618a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Results(headerName=", this.f26618a, ", headerCounter=", Separators.RPAREN);
    }
}
