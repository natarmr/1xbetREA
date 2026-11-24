package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class jkq extends v2 {
    public final v2 b;
    public final v2 c;
    public final boolean d;

    public jkq(v2 v2Var, v2 v2Var2, boolean z, Function0 function0) {
        super(function0);
        this.b = v2Var;
        this.c = v2Var2;
        this.d = z;
    }

    @Override // a.v2
    public final v2 A(boolean z) {
        v2 v2VarA = this.b.A(z);
        v2 v2VarA2 = this.c.A(z);
        v2VarA.getClass();
        v2VarA2.getClass();
        return v2VarA.equals(v2VarA2) ? v2VarA : new jkq(v2VarA, v2VarA2, this.d, null);
    }

    @Override // a.v2
    public final v2 B(boolean z) {
        v2 v2VarB = this.b.B(z);
        v2 v2VarB2 = this.c.B(z);
        v2VarB.getClass();
        v2VarB2.getClass();
        return v2VarB.equals(v2VarB2) ? v2VarB : new jkq(v2VarB, v2VarB2, this.d, null);
    }

    @Override // a.v2
    public final v2 C() {
        return this.c;
    }

    @Override // a.kiy
    public final List M() {
        return this.b.M();
    }

    @Override // a.v2
    public final kiy c() {
        return null;
    }

    @Override // a.v2
    public final a8z f() {
        return this.b.f();
    }

    @Override // a.kiy
    public final boolean h() {
        return this.b.h();
    }

    @Override // a.v2
    public final sgy j() {
        return this.b.j();
    }

    @Override // a.v2
    public final boolean n() {
        return false;
    }

    @Override // a.kiy
    public final fhy o() {
        fhy fhyVarO = this.b.o();
        if (!(fhyVarO instanceof sgy)) {
            return fhyVarO;
        }
        return sre0.f32672a.b(azw.H((sgy) fhyVarO));
    }

    @Override // a.v2
    public final boolean p() {
        return false;
    }

    @Override // a.v2
    public final boolean q() {
        return this.d;
    }

    @Override // a.v2
    public final boolean u() {
        return false;
    }

    @Override // a.v2
    public final v2 z() {
        return this.b;
    }
}
