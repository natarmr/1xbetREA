package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jzc implements lzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17405a;
    public final String b;
    public final boolean c;

    public jzc(String str, String str2, boolean z) {
        str.getClass();
        this.f17405a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzc)) {
            return false;
        }
        jzc jzcVar = (jzc) obj;
        return Intrinsics.d(this.f17405a, jzcVar.f17405a) && this.b.equals(jzcVar.b) && this.c == jzcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f17405a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("DEFAULT(coef=", this.f17405a, ", coefTitle=", this.b, ", coefInvisible="), this.c, Separators.RPAREN);
    }
}
