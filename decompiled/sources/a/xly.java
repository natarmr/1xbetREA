package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xly extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zly k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xly(zly zlyVar, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zlyVar;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        float f = this.l;
        zly zlyVar = this.k;
        switch (b) {
            case 0:
                return new xly(zlyVar, f, yjeVar, (byte) 0);
            default:
                return new xly(zlyVar, f, yjeVar, (byte) 1);
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
        return ((xly) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zly zlyVar = this.k;
        float f = this.l;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = zlyVar.B;
                    Float f2 = new Float(f);
                    uts0 uts0VarM0 = ro4.m0(300, 0, zlyVar.o, 2);
                    vly vlyVar = new vly(zlyVar, b2);
                    this.j = true;
                    if (t33.a(t33Var, f2, uts0VarM0, null, vlyVar, this, 4) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    t33 t33Var2 = zlyVar.B;
                    Float f3 = new Float(f);
                    this.j = true;
                    if (t33Var2.f(this, f3) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                zlyVar.q = f;
                n7x.I(zlyVar);
                return Unit.f46060a;
        }
    }
}
