package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ozj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rzj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozj(rzj rzjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rzjVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rzj rzjVar = this.k;
        switch (b) {
            case 0:
                return new ozj(rzjVar, yjeVar, (byte) 0);
            case 1:
                return new ozj(rzjVar, yjeVar, (byte) 1);
            default:
                return new ozj(rzjVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ozj) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rzj rzjVar = this.k;
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
                xot0 xot0VarN = rzjVar.n();
                this.j = true;
                Object objK = xot0VarN.k(this);
                return objK == wneVar ? wneVar : objK;
            case 1:
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
                jzj jzjVarD = rzjVar.n().d();
                this.j = true;
                Object objQ = ((odd) jzjVarD).q(this);
                return objQ == wneVar2 ? wneVar2 : objQ;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jzj jzjVarE = rzjVar.n().e();
                this.j = true;
                Object objQ2 = ((odd) jzjVarE).q(this);
                return objQ2 == wneVar3 ? wneVar3 : objQ2;
        }
    }
}
