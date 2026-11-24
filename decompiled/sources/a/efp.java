package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class efp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gfp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efp(gfp gfpVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gfpVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gfp gfpVar = this.k;
        switch (b) {
            case 0:
                return new efp(gfpVar, yjeVar, (byte) 0);
            case 1:
                return new efp(gfpVar, yjeVar, (byte) 1);
            default:
                efp efpVar = new efp(gfpVar, yjeVar, (byte) 2);
                efpVar.j = ((Boolean) obj).booleanValue();
                return efpVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((efp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((efp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((efp) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objK;
        Object value2;
        Object value3;
        c4m0 c4m0Var;
        byte b = this.i;
        gfp gfpVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kqc kqcVar = gfpVar.t;
                    this.j = true;
                    Object objB = kqcVar.b.b(this);
                    if (objB != wneVar) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = gfp.B;
                p7m0 p7m0Var = gfpVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, i9p.a((i9p) value, false, true, false, false, false, null, null, null, false, 8187)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    lbu lbuVar = gfpVar.p;
                    this.j = true;
                    objK = lbu.k(lbuVar, 0, this, 3);
                    if (objK == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                bo0 bo0Var = new bo0((List) objK, (byte) 12);
                int i2 = gfp.B;
                gfpVar.H(bo0Var);
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = gfp.B;
                ocj ocjVar = gfpVar.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, i9p.a((i9p) value2, false, false, false, false, false, null, null, null, z3, 4095)));
                if (z3 && ((c4m0Var = gfpVar.y) == null || !c4m0Var.isActive())) {
                    gfpVar.M();
                    gfpVar.N();
                } else if (!z3 && ((i9p) gfpVar.D()).f14397a) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, i9p.a((i9p) value3, false, false, false, true, false, null, null, null, false, 8172)));
                }
                return Unit.f46060a;
        }
    }
}
