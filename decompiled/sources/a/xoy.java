package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xoy extends ppy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41243a;
    public final int b;
    public final String c;

    public xoy(String str, int i) {
        str.getClass();
        this.f41243a = str;
        this.b = i;
        if (i <= 0) {
            jf4.o("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f41243a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(Separators.GREATER_THAN);
        }
        sb.append(Separators.RPAREN);
        this.c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoy)) {
            return false;
        }
        xoy xoyVar = (xoy) obj;
        return Intrinsics.d(this.f41243a, xoyVar.f41243a) && this.b == xoyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f41243a.hashCode() * 31);
    }

    public final String toString() {
        return this.c;
    }
}
