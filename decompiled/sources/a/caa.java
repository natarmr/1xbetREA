package a;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class caa implements baa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzs0 f3999a;
    public zl50 b;

    public caa(pzs0 pzs0Var) {
        pzs0Var.getClass();
        this.f3999a = pzs0Var;
        pzs0Var.a();
        t3u0 t3u0Var = t3u0.c;
    }

    @Override // a.iys0
    public final Collection b() {
        pzs0 pzs0Var = this.f3999a;
        wsy wsyVarB = pzs0Var.a() == t3u0.e ? pzs0Var.b() : c().p();
        wsyVarB.getClass();
        return kotlin.collections.a.c(wsyVarB);
    }

    @Override // a.iys0
    public final ary c() {
        ary aryVarC = this.f3999a.b().S().c();
        aryVarC.getClass();
        return aryVarC;
    }

    @Override // a.baa
    public final pzs0 f() {
        return this.f3999a;
    }

    @Override // a.iys0
    public final List getParameters() {
        return iun.f15405a;
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
        return "CapturedTypeConstructor(" + this.f3999a + ')';
    }
}
