package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w2i0 implements x2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38450a;

    /* JADX WARN: Multi-variable type inference failed */
    public w2i0(int i) {
        this.f38450a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2i0) && this.f38450a == ((w2i0) obj).f38450a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38450a);
    }

    public final String toString() {
        return ua80.e(this.f38450a, "OnTimeFilterItemClick(selected=", Separators.RPAREN);
    }
}
