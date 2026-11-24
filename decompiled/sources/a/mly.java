package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class mly extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nly k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mly(nly nlyVar, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nlyVar;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new mly(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new mly(this.k, this.l, yjeVar, (byte) 1);
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
        return ((mly) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nly nlyVar = this.k;
        float f = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = nlyVar.A;
                    Float f2 = new Float(f);
                    uts0 uts0VarM0 = ro4.m0(300, 0, nlyVar.p, 2);
                    lly llyVar = new lly(nlyVar, (byte) 2);
                    this.j = true;
                    if (t33.a(t33Var, f2, uts0VarM0, null, llyVar, this, 4) == wneVar) {
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
                    t33 t33Var2 = nlyVar.A;
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
                nlyVar.s = f;
                vcc.Z(nlyVar).V(false);
                return Unit.f46060a;
        }
    }
}
