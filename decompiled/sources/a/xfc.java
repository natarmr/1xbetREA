package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xfc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ i3t0 j;
    public final /* synthetic */ clz k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfc(i3t0 i3t0Var, clz clzVar, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        switch (b) {
            case 1:
                lkz lkzVar = lkz.f20223a;
                this.j = i3t0Var;
                this.k = clzVar;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = clzVar;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            default:
                lkz lkzVar3 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = clzVar;
                this.l = pz40Var;
                break;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new xfc(this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new xfc(this.j, this.k, this.l, yjeVar, (byte) 1);
            default:
                lkz lkzVar3 = lkz.f20223a;
                return new xfc(this.j, this.k, this.l, yjeVar, (byte) 2);
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
        return ((xfc) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.l;
        i3t0 i3t0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC = i3t0Var.C();
                lkz lkzVar = lkz.f20223a;
                o47 o47Var = new o47(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 29);
                clz clzVar = this.k;
                qjj.W(g1x.u(clzVar), null, null, new vxb((i89) gmqVarC, clzVar, o47Var, (yje) null, (char) 0), 3);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC2 = i3t0Var.C();
                lkz lkzVar2 = lkz.f20223a;
                mhc mhcVar = new mhc(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 22);
                clz clzVar2 = this.k;
                qjj.W(g1x.u(clzVar2), null, null, new g8g((i89) gmqVarC2, clzVar2, mhcVar, (yje) null, 0), 3);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC3 = i3t0Var.C();
                lkz lkzVar3 = lkz.f20223a;
                yn90 yn90Var = new yn90(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 26);
                clz clzVar3 = this.k;
                qjj.W(g1x.u(clzVar3), null, null, new fxc0((i89) gmqVarC3, clzVar3, yn90Var, (yje) null, (char) 0), 3);
                break;
        }
        return Unit.f46060a;
    }
}
