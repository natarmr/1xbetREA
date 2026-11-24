package a;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zl50 implements baa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzs0 f44565a;
    public Function0 b;
    public final zl50 c;
    public final hzs0 d;
    public final a8z e;

    public zl50(pzs0 pzs0Var, Function0 function0, zl50 zl50Var, hzs0 hzs0Var) {
        pzs0Var.getClass();
        this.f44565a = pzs0Var;
        this.b = function0;
        this.c = zl50Var;
        this.d = hzs0Var;
        this.e = maz.a(wez.f39042a, new ej50(this, (byte) 1));
    }

    @Override // a.iys0
    public final Collection b() {
        List list = (List) this.e.getValue();
        return list == null ? iun.f15405a : list;
    }

    @Override // a.iys0
    public final ary c() {
        wsy wsyVarB = this.f44565a.b();
        wsyVarB.getClass();
        return vsm0.q(wsyVarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zl50.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zl50 zl50Var = (zl50) obj;
        zl50 zl50Var2 = this.c;
        if (zl50Var2 != null) {
            this = zl50Var2;
        }
        zl50 zl50Var3 = zl50Var.c;
        if (zl50Var3 != null) {
            obj = zl50Var3;
        }
        return this == obj;
    }

    @Override // a.baa
    public final pzs0 f() {
        return this.f44565a;
    }

    @Override // a.iys0
    public final List getParameters() {
        return iun.f15405a;
    }

    public final int hashCode() {
        zl50 zl50Var = this.c;
        return zl50Var != null ? zl50Var.hashCode() : super.hashCode();
    }

    @Override // a.iys0
    public final foc n() {
        return null;
    }

    @Override // a.iys0
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.f44565a + ')';
    }

    public /* synthetic */ zl50(pzs0 pzs0Var, zek zekVar, hzs0 hzs0Var, int i) {
        this(pzs0Var, (i & 2) != 0 ? null : zekVar, (zl50) null, (i & 8) != 0 ? null : hzs0Var);
    }
}
