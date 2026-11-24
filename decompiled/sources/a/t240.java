package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class t240 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ j340 k;
    public final /* synthetic */ ql5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t240(j340 j340Var, ql5 ql5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j340Var;
        this.l = ql5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ql5 ql5Var = this.l;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                return new t240(j340Var, ql5Var, yjeVar, (byte) 0);
            default:
                return new t240(j340Var, ql5Var, yjeVar, (byte) 1);
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
        return ((t240) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        j340 j340Var = this.k;
        ql5 ql5Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    mnb mnbVar = j340Var.E;
                    this.j = true;
                    if (mnbVar.a(ql5Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((ag3) j340Var.L.h).f809a.c("change_bill_done");
                j340Var.G(u040.f34837a);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = j340Var.D;
                    this.j = true;
                    obj = ahuVar.b(bm5.f2822a, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((ql5) obj).f28916a != ql5Var.f28916a) {
                    if (((vlk) j340Var.F.b).b()) {
                        ctf0 ctf0Var = j340Var.J;
                        String strA = ctf0Var.b.a(R.string.account_change_warning, Arrays.copyOf(new Object[0], 0));
                        if (!ql5Var.i.e()) {
                            strA = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{strA, ctf0Var.b.a(R.string.account_change_warning2, Arrays.copyOf(new Object[0], 0))}, 2));
                        }
                        j340Var.G(new w040(ql5Var, strA));
                    } else {
                        j340Var.M(ql5Var);
                    }
                }
                return Unit.f46060a;
        }
    }
}
