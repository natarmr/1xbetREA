package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class afh0 implements hfh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f778a;
    public final sah0 b;
    public final ahh0 c;

    public afh0(i4 i4Var, sah0 sah0Var, ahh0 ahh0Var) {
        i4Var.getClass();
        sah0Var.getClass();
        this.f778a = i4Var;
        this.b = sah0Var;
        this.c = ahh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afh0)) {
            return false;
        }
        afh0 afh0Var = (afh0) obj;
        return Intrinsics.d(this.f778a, afh0Var.f778a) && this.b == afh0Var.b && this.c.equals(afh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f778a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActiveSearch(content=" + this.f778a + ", scrollType=" + this.b + ", scrollModel=" + this.c + Separators.RPAREN;
    }
}
