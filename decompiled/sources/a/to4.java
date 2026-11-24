package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class to4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uo4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to4(uo4 uo4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uo4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uo4 uo4Var = this.k;
        switch (b) {
            case 0:
                return new to4(uo4Var, yjeVar, (byte) 0);
            default:
                return new to4(uo4Var, yjeVar, (byte) 1);
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
        return ((to4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        uo4 uo4Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    oo4 oo4Var = uo4Var.c;
                    this.j = true;
                    qoj0 qoj0Var = ((po4) oo4Var).j;
                    Object obj2 = Unit.f46060a;
                    Object objA = qoj0Var.a(obj2, this);
                    if (objA == wneVar) {
                        obj2 = objA;
                    }
                    if (obj2 == wneVar) {
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
                    oo4 oo4Var2 = uo4Var.c;
                    this.j = true;
                    qoj0 qoj0Var2 = ((po4) oo4Var2).h;
                    Object obj3 = Unit.f46060a;
                    Object objA2 = qoj0Var2.a(obj3, this);
                    if (objA2 == wneVar2) {
                        obj3 = objA2;
                    }
                    if (obj3 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
