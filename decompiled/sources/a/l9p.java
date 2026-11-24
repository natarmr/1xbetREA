package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19666a;
    public final int b;

    public l9p(String str, int i) {
        str.getClass();
        this.f19666a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f19666a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9p)) {
            return false;
        }
        l9p l9pVar = (l9p) obj;
        return Intrinsics.d(this.f19666a, l9pVar.f19666a) && this.b == l9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f19666a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "All(headerName=", this.f19666a, ", headerCounter=", Separators.RPAREN);
    }
}
