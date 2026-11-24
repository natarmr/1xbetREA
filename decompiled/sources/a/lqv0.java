package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lqv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nqv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv0(nqv0 nqv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nqv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nqv0 nqv0Var = this.k;
        switch (b) {
            case 0:
                return new lqv0(nqv0Var, yjeVar, (byte) 0);
            default:
                return new lqv0(nqv0Var, yjeVar, (byte) 1);
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
        return ((lqv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object jqv0Var;
        byte b = this.i;
        nqv0 nqv0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    Object objE = nqv0Var.e(this);
                    return objE == wneVar ? wneVar : objE;
                }
                if (z) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                byte b2 = 0;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        dby dbyVar = nqv0Var.l;
                        lqv0 lqv0Var = new lqv0(nqv0Var, yjeVar, b2);
                        this.j = true;
                        obj = qjj.d0(dbyVar, lqv0Var, this);
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
                    jqv0Var = (kqv0) obj;
                    break;
                } catch (eqv0 e) {
                    jqv0Var = new iqv0(e.f8255a);
                } catch (CancellationException unused) {
                    jqv0Var = new gqv0();
                } catch (Throwable th) {
                    wv00.f().e(oqv0.f25709a, "Unexpected error in WorkerWrapper", th);
                    jqv0Var = new jqv0(false);
                }
                hie0 hie0Var = new hie0();
                nqv0Var.g.p(new cps0(jqv0Var, hie0Var, nqv0Var, (byte) 4));
                return Boolean.valueOf(hie0Var.f13108a);
        }
    }
}
