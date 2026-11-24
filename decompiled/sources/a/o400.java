package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o400 implements q400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24609a;
    public final String b;
    public final int c;

    public o400(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24609a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o400)) {
            return false;
        }
        o400 o400Var = (o400) obj;
        return Intrinsics.d(this.f24609a, o400Var.f24609a) && Intrinsics.d(this.b, o400Var.b) && this.c == o400Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f24609a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("HeaderWithDescription(title=", this.f24609a, ", description=", this.b, ", index="));
    }
}
