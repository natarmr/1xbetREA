package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xcz j;
    public final /* synthetic */ pkk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(xcz xczVar, pkk0 pkk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xczVar;
        this.k = pkk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pkk0 pkk0Var = this.k;
        xcz xczVar = this.j;
        switch (b) {
            case 0:
                return new hn(xczVar, pkk0Var, yjeVar, (byte) 0);
            case 1:
                return new hn(xczVar, pkk0Var, yjeVar, (byte) 1);
            default:
                return new hn(xczVar, pkk0Var, yjeVar, (byte) 2);
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
        return ((hn) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pkk0 pkk0Var = this.k;
        xcz xczVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (xczVar.j.a() && pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (xczVar.j.a() && pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (xczVar.j.a() && pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
        }
        return Unit.f46060a;
    }
}
