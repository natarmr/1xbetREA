package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ta4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ i3t0 j;
    public final /* synthetic */ Fragment k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta4(i3t0 i3t0Var, Fragment fragment, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        switch (b) {
            case 1:
                lkz lkzVar = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                super(2, yjeVar);
                break;
            default:
                lkz lkzVar6 = lkz.f20223a;
                this.j = i3t0Var;
                this.k = fragment;
                this.l = pz40Var;
                break;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 3);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 4);
            default:
                lkz lkzVar6 = lkz.f20223a;
                return new ta4(this.j, this.k, this.l, yjeVar, (byte) 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((ta4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        pz40 pz40Var = this.l;
        Fragment fragment = this.k;
        i3t0 i3t0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC = i3t0Var.C();
                lkz lkzVar = lkz.f20223a;
                df2 df2Var = new df2(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 5);
                clz clzVarW = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW.x()), null, null, new tg3((i89) gmqVarC, clzVarW, df2Var, (yje) null, (char) 0), 3);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC2 = i3t0Var.C();
                lkz lkzVar2 = lkz.f20223a;
                o47 o47Var = new o47(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 20);
                clz clzVarW2 = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW2.x()), null, null, new yxa((i89) gmqVarC2, clzVarW2, o47Var, (yje) null, (byte) 0), 3);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC3 = i3t0Var.C();
                lkz lkzVar3 = lkz.f20223a;
                yn90 yn90Var = new yn90(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2);
                clz clzVarW3 = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW3.x()), null, null, new w090((i89) gmqVarC3, clzVarW3, yn90Var, (yje) null, (char) 0), 3);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC4 = i3t0Var.C();
                lkz lkzVar4 = lkz.f20223a;
                due0 due0Var = new due0(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 5);
                clz clzVarW4 = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW4.x()), null, null, new w7f0((i89) gmqVarC4, clzVarW4, due0Var, (yje) null), 3);
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC5 = i3t0Var.C();
                lkz lkzVar5 = lkz.f20223a;
                due0 due0Var2 = new due0(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 13);
                clz clzVarW5 = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW5.x()), null, null, new kmg0((i89) gmqVarC5, clzVarW5, due0Var2, (yje) null), 3);
                break;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC6 = i3t0Var.C();
                lkz lkzVar6 = lkz.f20223a;
                nfj0 nfj0Var = new nfj0(2, (Function1) pz40Var.getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 20);
                clz clzVarW6 = aac.W(fragment);
                qjj.W(x0x.Q(clzVarW6.x()), null, null, new agn0((i89) gmqVarC6, clzVarW6, nfj0Var, (yje) null, 0), 3);
                break;
        }
        return Unit.f46060a;
    }
}
