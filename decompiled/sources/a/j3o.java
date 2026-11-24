package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j3o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15845a;
    public final /* synthetic */ k3o b;

    public /* synthetic */ j3o(k3o k3oVar, byte b) {
        this.f15845a = b;
        this.b = k3oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15845a;
        k3o k3oVar = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                nek nekVar = k3o.R1;
                uidVar.getClass();
                k3oVar.G0().x(new t2o(uidVar));
                return Unit.f46060a;
            case 1:
                hhq0 hhq0Var = (hhq0) obj;
                nek nekVar2 = k3o.R1;
                hhq0Var.getClass();
                k3oVar.G0().x(new e3o(hhq0Var));
                return Unit.f46060a;
            case 2:
                h3o h3oVar = (h3o) obj;
                nek nekVar3 = k3o.R1;
                h3oVar.getClass();
                k3oVar.G0().x(h3oVar);
                return Unit.f46060a;
            default:
                x3o x3oVar = (x3o) obj;
                nek nekVar4 = k3o.R1;
                x3oVar.getClass();
                if (x3oVar instanceof u3o) {
                    j120.Y(k3oVar);
                } else if (x3oVar instanceof w3o) {
                    w3o w3oVar = (w3o) x3oVar;
                    m6m0 m6m0Var = fhq0.q2;
                    androidx.fragment.app.e eVarC = k3oVar.C();
                    eVarC.getClass();
                    ygq0 ygq0Var = w3oVar.f38510a;
                    long j = w3oVar.b;
                    long j2 = w3oVar.c;
                    m6m0Var.getClass();
                    String str = fhq0.s2;
                    if (eVarC.J(str) == null) {
                        fhq0 fhq0Var = new fhq0();
                        byte b2 = ygq0Var.f42598a;
                        iiy[] iiyVarArr = fhq0.r2;
                        fhq0Var.f2.I(fhq0Var, iiyVarArr[0], b2);
                        fhq0Var.g2.j(fhq0Var, iiyVarArr[1], j);
                        fhq0Var.h2.j(fhq0Var, iiyVarArr[2], j2);
                        fhq0Var.i2.v(fhq0Var, iiyVarArr[3], false);
                        fhq0Var.j2.v(fhq0Var, iiyVarArr[4], true);
                        fhq0Var.k2.v(fhq0Var, iiyVarArr[5], true);
                        fhq0Var.l2.v(fhq0Var, iiyVarArr[6], false);
                        fhq0Var.H0(eVarC, str);
                    }
                } else {
                    if (!(x3oVar instanceof v3o)) {
                        t9f.b();
                        return null;
                    }
                    ujd ujdVar = k3oVar.L1;
                    if (ujdVar == null) {
                        Intrinsics.h("gameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(k3oVar, ((v3o) x3oVar).f36738a);
                }
                k3oVar.G0().x(o2o.f24539a);
                return Unit.f46060a;
        }
    }
}
