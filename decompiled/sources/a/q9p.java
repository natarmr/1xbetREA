package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28361a;
    public final int b;

    public q9p(String str, int i) {
        str.getClass();
        this.f28361a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f28361a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9p)) {
            return false;
        }
        q9p q9pVar = (q9p) obj;
        return Intrinsics.d(this.f28361a, q9pVar.f28361a) && this.b == q9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f28361a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Teams(headerName=", this.f28361a, ", headerCounter=", Separators.RPAREN);
    }
}
