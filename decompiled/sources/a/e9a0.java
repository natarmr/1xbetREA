package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7411a;
    public final String b;
    public final String c;

    public e9a0(String str, String str2, String str3) {
        str.getClass();
        this.f7411a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9a0)) {
            return false;
        }
        e9a0 e9a0Var = (e9a0) obj;
        return Intrinsics.d(this.f7411a, e9a0Var.f7411a) && this.b.equals(e9a0Var.b) && this.c.equals(e9a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7411a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PlayerModelStatistic(id=", this.f7411a, ", image=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
