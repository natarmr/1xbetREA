package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17925a;
    public final int b;

    public k9p(String str, int i) {
        str.getClass();
        this.f17925a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f17925a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9p)) {
            return false;
        }
        k9p k9pVar = (k9p) obj;
        return Intrinsics.d(this.f17925a, k9pVar.f17925a) && this.b == k9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f17925a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Aggregator(headerName=", this.f17925a, ", headerCounter=", Separators.RPAREN);
    }
}
