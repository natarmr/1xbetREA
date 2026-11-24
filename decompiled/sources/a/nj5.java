package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class nj5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dk5 k;
    public final /* synthetic */ ql5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj5(dk5 dk5Var, ql5 ql5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dk5Var;
        this.l = ql5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ql5 ql5Var = this.l;
        dk5 dk5Var = this.k;
        switch (b) {
            case 0:
                return new nj5(dk5Var, ql5Var, yjeVar, (byte) 0);
            default:
                return new nj5(dk5Var, ql5Var, yjeVar, (byte) 1);
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
        return ((nj5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dk5 dk5Var = this.k;
        ql5 ql5Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    mnb mnbVar = dk5Var.H;
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
                bby bbyVar = dk5Var.X;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                qes0 qes0Var = dk5Var.P;
                if (qes0Var != null) {
                    qes0Var.c();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = dk5Var.D;
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
                    if (((vlk) dk5Var.E.b).b()) {
                        ctf0 ctf0Var = dk5Var.B;
                        String strF = ctf0Var.f(R.string.account_change_warning, new Object[0]);
                        if (!ql5Var.i.e()) {
                            strF = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{strF, ctf0Var.f(R.string.account_change_warning2, new Object[0])}, 2));
                        }
                        dk5Var.b0.f(new ij5(ql5Var, strF));
                    } else {
                        dk5Var.w(ql5Var);
                    }
                }
                return Unit.f46060a;
        }
    }
}
