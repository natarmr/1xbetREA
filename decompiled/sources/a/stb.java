package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class stb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ utb l;
    public final /* synthetic */ kmq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stb(utb utbVar, kmq kmqVar, Object obj, yje yjeVar) {
        super(2, yjeVar);
        this.l = utbVar;
        this.m = kmqVar;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kmq kmqVar = this.m;
        utb utbVar = this.l;
        switch (b) {
            case 0:
                return new stb(utbVar, kmqVar, this.k, yjeVar);
            default:
                stb stbVar = new stb(utbVar, kmqVar, yjeVar);
                stbVar.k = obj;
                return stbVar;
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
        return ((stb) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        kmq kmqVar = this.m;
        utb utbVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xdr xdrVar = utbVar.e;
                    Object obj2 = this.k;
                    this.j = true;
                    if (xdrVar.F(kmqVar, obj2, this) == wneVar) {
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
                vne vneVar = (vne) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    mie0 mie0VarJ = ohs0.j(obj);
                    gmq gmqVar = utbVar.d;
                    y38 y38Var = new y38(mie0VarJ, vneVar, utbVar, kmqVar);
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(y38Var, this) == wneVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stb(utb utbVar, kmq kmqVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = utbVar;
        this.m = kmqVar;
    }
}
