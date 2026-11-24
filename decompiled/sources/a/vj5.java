package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vj5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dk5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj5(dk5 dk5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dk5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dk5 dk5Var = this.k;
        switch (b) {
            case 0:
                vj5 vj5Var = new vj5(dk5Var, yjeVar, (byte) 0);
                vj5Var.j = obj;
                return vj5Var;
            case 1:
                vj5 vj5Var2 = new vj5(dk5Var, yjeVar, (byte) 1);
                vj5Var2.j = obj;
                return vj5Var2;
            case 2:
                vj5 vj5Var3 = new vj5(dk5Var, yjeVar, (byte) 2);
                vj5Var3.j = obj;
                return vj5Var3;
            case 3:
                vj5 vj5Var4 = new vj5(dk5Var, yjeVar, (byte) 3);
                vj5Var4.j = obj;
                return vj5Var4;
            default:
                vj5 vj5Var5 = new vj5(dk5Var, yjeVar, (byte) 4);
                vj5Var5.j = obj;
                return vj5Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vj5) create((w9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vj5) create((fl80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vj5) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((vj5) create((w9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vj5) create((fl80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dk5 dk5Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return dk5Var.R((w9h0) obj2);
            case 1:
                fl80 fl80Var = (fl80) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                dk5Var.i0.n(fl80Var);
                p7m0 p7m0Var = dk5Var.h0;
                boolean zH = dk5Var.B.h();
                boolean zS = dk5Var.S();
                p7m0 p7m0Var2 = dk5Var.i0;
                g2v g2vVar = dk5Var.t;
                pb10 pb10Var = pb10.g;
                mk5 mk5Var = new mk5(zH, zS, fl80Var, g2v.d(g2vVar, pb10Var, null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), ocl.b(dk5Var.u, pb10Var, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), p7m0Var2);
                p7m0Var.getClass();
                p7m0Var.o(null, mk5Var);
                return Unit.f46060a;
            case 2:
                ql5 ql5Var = (ql5) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ql5 ql5Var2 = dk5Var.Q;
                if (ql5Var2 != null && ql5Var2.f28916a != ql5Var.f28916a) {
                    vi5 vi5Var = (vi5) ((nhf0) dk5Var.o.b).f23530a;
                    vi5Var.b = iun.f15405a;
                    vi5Var.c = false;
                    dk5Var.z();
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                vk5 vk5VarR = dk5Var.R((w9h0) obj2);
                if ((vk5VarR instanceof ues0) || (vk5VarR instanceof tds0)) {
                    p7m0 p7m0Var3 = dk5Var.a0;
                    oi5 oi5Var = new oi5(dk5Var.B.f(R.string.archive_is_empty, new Object[0]));
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, oi5Var);
                }
                return vk5VarR;
            default:
                fl80 fl80Var2 = (fl80) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                dk5Var.i0.n(fl80Var2);
                p7m0 p7m0Var4 = dk5Var.h0;
                boolean zH2 = dk5Var.B.h();
                boolean zS2 = dk5Var.S();
                p7m0 p7m0Var5 = dk5Var.i0;
                g2v g2vVar2 = dk5Var.t;
                pb10 pb10Var2 = pb10.g;
                mk5 mk5Var2 = new mk5(zH2, zS2, fl80Var2, g2v.d(g2vVar2, pb10Var2, null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), ocl.b(dk5Var.u, pb10Var2, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), p7m0Var5);
                p7m0Var4.getClass();
                p7m0Var4.o(null, mk5Var2);
                return Unit.f46060a;
        }
    }
}
