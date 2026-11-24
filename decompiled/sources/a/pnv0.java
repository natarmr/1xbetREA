package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pnv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnv0(n2w0 n2w0Var, ghk0 ghk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.j = n2w0Var;
        this.k = ghk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                pnv0 pnv0Var = new pnv0(obj2, yjeVar, (byte) 0);
                pnv0Var.j = obj;
                return pnv0Var;
            case 1:
                pnv0 pnv0Var2 = new pnv0(obj2, yjeVar, (byte) 1);
                pnv0Var2.j = obj;
                return pnv0Var2;
            default:
                return new pnv0((n2w0) this.j, (ghk0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pnv0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pnv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pnv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((qnv0) obj2).r.b(th, new i9v0((byte) 13));
                break;
            case 1:
                vne vneVar = (vne) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                buv0 buv0Var = (buv0) obj2;
                yje yjeVar = null;
                qjj.W(vneVar, null, null, new ztv0(buv0Var, yjeVar, (byte) 0), 3);
                qjj.W(vneVar, null, null, new ztv0(buv0Var, yjeVar, (byte) 1), 3);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                n2w0 n2w0Var = (n2w0) this.j;
                bzs0 bzs0Var = n2w0.h2;
                n2w0Var.F().t0(i120.V(new Pair("SUCCESS_SOCIAL", (ghk0) obj2)), "SUCCESS_SOCIAL");
                n2w0Var.y0();
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnv0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
