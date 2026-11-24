package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z5t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ b6t k;
    public final /* synthetic */ jo20 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5t(b6t b6tVar, jo20 jo20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b6tVar;
        this.l = jo20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jo20 jo20Var = this.l;
        b6t b6tVar = this.k;
        switch (b) {
            case 0:
                return new z5t(b6tVar, jo20Var, yjeVar, (byte) 0);
            default:
                return new z5t(b6tVar, jo20Var, yjeVar, (byte) 1);
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
        return ((z5t) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jo20 jo20Var = this.l;
        b6t b6tVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                uyn uynVar = b6tVar.f2072a;
                this.j = true;
                Object objC = uynVar.c(jo20Var, this);
                return objC == wneVar ? wneVar : objC;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                uyn uynVar2 = b6tVar.f2072a;
                this.j = true;
                Object objB = uynVar2.b(jo20Var, this);
                return objB == wneVar2 ? wneVar2 : objB;
        }
    }
}
