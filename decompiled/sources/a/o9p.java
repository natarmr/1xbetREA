package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24890a;
    public final int b;

    public o9p(String str, int i) {
        str.getClass();
        this.f24890a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f24890a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9p)) {
            return false;
        }
        o9p o9pVar = (o9p) obj;
        return Intrinsics.d(this.f24890a, o9pVar.f24890a) && this.b == o9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f24890a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Live(headerName=", this.f24890a, ", headerCounter=", Separators.RPAREN);
    }
}
