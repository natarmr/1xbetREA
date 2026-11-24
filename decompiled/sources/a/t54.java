package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t54 implements u54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f33350a;

    /* JADX WARN: Multi-variable type inference failed */
    public t54(int i) {
        this.f33350a = i;
    }

    @Override // a.u54
    public final int a() {
        return this.f33350a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t54) && this.f33350a == ((t54) obj).f33350a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33350a);
    }

    public final String toString() {
        return ua80.e(this.f33350a, "Social(typeByInt=", Separators.RPAREN);
    }
}
