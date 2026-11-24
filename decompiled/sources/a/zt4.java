package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zt4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ku4 k;
    public final /* synthetic */ xo4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt4(ku4 ku4Var, xo4 xo4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ku4Var;
        this.l = xo4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xo4 xo4Var = this.l;
        ku4 ku4Var = this.k;
        switch (b) {
            case 0:
                return new zt4(ku4Var, xo4Var, yjeVar, (byte) 0);
            default:
                return new zt4(ku4Var, xo4Var, yjeVar, (byte) 1);
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
        return ((zt4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        vt4 vt4Var = vt4.f37984a;
        ku4 ku4Var = this.k;
        xo4 xo4Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    qq4 qq4Var = ku4.J;
                    ku4Var.G(vt4Var);
                    oif0 oif0Var = ku4Var.d;
                    String str = xo4Var.j;
                    String str2 = xo4Var.l;
                    this.j = true;
                    if (oif0Var.B(str, str2, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                qq4 qq4Var2 = ku4.J;
                ku4Var.A(true);
                return Unit.f46060a;
            default:
                String str3 = xo4Var.j;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qq4 qq4Var3 = ku4.J;
                    ku4Var.G(vt4Var);
                    dkj dkjVar = ku4Var.e;
                    this.j = true;
                    ts4 ts4Var = dkjVar.f6232a;
                    Object objH = ((ws4) ts4Var.m.invoke()).h(ts4Var.h.a(), str3, "application/vnd.xenvelop+json", this);
                    if (objH != wneVar2) {
                        objH = Unit.f46060a;
                    }
                    if (objH != wneVar2) {
                        objH = Unit.f46060a;
                    }
                    if (objH == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ku4Var.v.f(new mt4(str3.hashCode()));
                ku4Var.A(true);
                return Unit.f46060a;
        }
    }
}
