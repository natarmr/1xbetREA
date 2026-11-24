package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ico0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zco0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ico0(zco0 zco0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zco0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                return new ico0(zco0Var, yjeVar, (byte) 0);
            default:
                return new ico0(zco0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ico0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        uql0 uql0Var;
        Object objC2;
        Object value;
        byte b = this.i;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j3c j3cVar = zco0Var.v;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                int i = zco0.r0;
                int iOrdinal = zco0Var.P().g.f22419a.ordinal();
                if (iOrdinal == 0) {
                    uql0Var = uql0.c;
                } else if (iOrdinal == 1) {
                    uql0Var = uql0.f36125a;
                } else if (iOrdinal == 2) {
                    uql0Var = uql0.d;
                } else if (iOrdinal == 3) {
                    uql0Var = uql0.e;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    uql0Var = uql0.b;
                }
                uql0 uql0Var2 = uql0Var;
                npo npoVarB0 = gkb.b0(zco0Var.P().g.A);
                v5l0 v5l0Var = zco0Var.P().g.y;
                boolean z2 = zco0Var.P().J;
                r9u r9uVar = zco0Var.P;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                zco0Var.H(new qxf(uql0Var2, z2, wcbVar, npoVarB0, v5l0Var, j1q0Var.f15748a.d(ygpVar)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    r2u r2uVar = zco0Var.O;
                    this.j = true;
                    objC2 = r2uVar.c(this);
                    if (objC2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC2 = obj;
                }
                List list = (List) objC2;
                int i2 = zco0.r0;
                p7m0 p7m0Var = zco0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, glb0.a((glb0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, false, 29360127)));
                return Unit.f46060a;
        }
    }
}
