package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zkh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44533a;
    public final String b;
    public final boolean c;

    public zkh0(String str, int i, boolean z) {
        str.getClass();
        this.f44533a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkh0)) {
            return false;
        }
        zkh0 zkh0Var = (zkh0) obj;
        return this.f44533a == zkh0Var.f44533a && Intrinsics.d(this.b, zkh0Var.b) && this.c == zkh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f44533a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f44533a, "SecretQuestionItem(id=", ", text=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
