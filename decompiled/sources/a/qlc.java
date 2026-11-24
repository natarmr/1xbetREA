package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qlc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swq f28927a;
    public final swq b;
    public final boolean c;

    public qlc(swq swqVar, swq swqVar2, boolean z) {
        swqVar.getClass();
        swqVar2.getClass();
        this.f28927a = swqVar;
        this.b = swqVar2;
        this.c = z;
        swqVar2.f32934a.c();
    }

    public static final String c(swq swqVar) {
        String str = swqVar.f32934a.f34663a;
        return StringsKt.P(str, '/') ? hne.l('`', "`", str) : str;
    }

    public final swq a() {
        swq swqVar = this.f28927a;
        boolean zC = swqVar.f32934a.c();
        swq swqVar2 = this.b;
        if (zC) {
            return swqVar2;
        }
        return new swq(swqVar.f32934a.f34663a + '.' + swqVar2.f32934a.f34663a);
    }

    public final String b() {
        swq swqVar = this.f28927a;
        boolean zC = swqVar.f32934a.c();
        swq swqVar2 = this.b;
        if (zC) {
            return c(swqVar2);
        }
        return kotlin.text.c.s(swqVar.f32934a.f34663a, '.', '/') + Separators.SLASH + c(swqVar2);
    }

    public final qlc d(g950 g950Var) {
        g950Var.getClass();
        return new qlc(this.f28927a, this.b.a(g950Var), this.c);
    }

    public final qlc e() {
        swq swqVarB = this.b.b();
        if (swqVarB.f32934a.c()) {
            return null;
        }
        return new qlc(this.f28927a, swqVarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlc)) {
            return false;
        }
        qlc qlcVar = (qlc) obj;
        return Intrinsics.d(this.f28927a, qlcVar.f28927a) && Intrinsics.d(this.b, qlcVar.b) && this.c == qlcVar.c;
    }

    public final g950 f() {
        return this.b.f32934a.g();
    }

    public final boolean g() {
        return !this.b.b().f32934a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f28927a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zC = this.f28927a.f32934a.c();
        String strB = b();
        return zC ? Separators.SLASH.concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qlc(swq swqVar, g950 g950Var) {
        this(swqVar, mbc.g0(g950Var), false);
        swqVar.getClass();
        g950Var.getClass();
        swq swqVar2 = swq.c;
    }
}
