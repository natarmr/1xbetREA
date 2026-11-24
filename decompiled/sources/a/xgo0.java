package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xgo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ fho0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgo0(fho0 fho0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = fho0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fho0 fho0Var = this.j;
        switch (b) {
            case 0:
                return new xgo0(fho0Var, yjeVar, (byte) 0);
            default:
                return new xgo0(fho0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xgo0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xgo0) create((ab50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fho0 fho0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fho0Var.i.k(pzb.C(new meo0((byte) 4)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fho0Var.D0.f(ago0.f834a);
                break;
        }
        return Unit.f46060a;
    }
}
