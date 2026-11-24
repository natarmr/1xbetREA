package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tw10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cx10 k;
    public final /* synthetic */ ql5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw10(cx10 cx10Var, ql5 ql5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cx10Var;
        this.l = ql5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ql5 ql5Var = this.l;
        cx10 cx10Var = this.k;
        switch (b) {
            case 0:
                return new tw10(cx10Var, ql5Var, yjeVar, (byte) 0);
            default:
                return new tw10(cx10Var, ql5Var, yjeVar, (byte) 1);
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
        return ((tw10) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        cx10 cx10Var = this.k;
        ql5 ql5Var = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    mnb mnbVar = cx10Var.r;
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
                cx10Var.z();
                ((ag3) cx10Var.z.h).f809a.c("change_bill_done");
                cx10Var.G.f(gw10.f12003a);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = cx10Var.q;
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
                    byte b2 = 0;
                    if (((vlk) cx10Var.s.b).b()) {
                        ctf0 ctf0Var = cx10Var.w;
                        String strF = ctf0Var.f(R.string.account_change_warning, new Object[0]);
                        if (!ql5Var.i.e()) {
                            strF = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{strF, ctf0Var.f(R.string.account_change_warning2, new Object[0])}, 2));
                        }
                        cx10Var.G.f(new iw10(ql5Var, strF));
                    } else {
                        sac.V(jiu0.a(cx10Var), sw10.f32899a, null, null, new tw10(cx10Var, ql5Var, yjeVar, b2), 14);
                    }
                }
                return Unit.f46060a;
        }
    }
}
