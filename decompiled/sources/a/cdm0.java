package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class cdm0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4168a;
    public final Object b;
    public final Object c;
    public final Object d;

    public cdm0(kmq kmqVar, CoroutineContext coroutineContext) {
        this.f4168a = (byte) 3;
        this.b = coroutineContext;
        this.c = ecq0.b(coroutineContext);
        this.d = new n7t0(kmqVar, null, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        bdm0 bdm0Var;
        wqn0 wqn0Var;
        ryn0 ryn0Var;
        byte b = this.f4168a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof bdm0) {
                    bdm0Var = (bdm0) yjeVar;
                    int i = bdm0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bdm0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        bdm0Var = new bdm0(this, yjeVar);
                    }
                } else {
                    bdm0Var = new bdm0(this, yjeVar);
                }
                Object obj5 = bdm0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = bdm0Var.j;
                if (i2 == 0) {
                    z1x.P(obj5);
                    kmq kmqVar = (kmq) obj4;
                    xqj0 xqj0Var = (xqj0) ((ddm0) obj3).f5902a.get((String) obj2);
                    if (xqj0Var == null) {
                        xqj0Var = xqj0.v;
                    }
                    bdm0Var.j = 1;
                    if (kmqVar.a(xqj0Var, bdm0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof wqn0) {
                    wqn0Var = (wqn0) yjeVar;
                    int i3 = wqn0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wqn0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        wqn0Var = new wqn0(this, yjeVar);
                    }
                } else {
                    wqn0Var = new wqn0(this, yjeVar);
                }
                Object obj6 = wqn0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = wqn0Var.j;
                if (i4 == 0) {
                    z1x.P(obj6);
                    ql5 ql5Var = (ql5) obj;
                    pn40 pn40Var = pn40.f27267a;
                    double d = ((jsn0) obj3).f17062a;
                    p3u0 p3u0Var = p3u0.c;
                    ksn0 ksn0Var = new ksn0(pn40.c(d, p3u0Var), pn40.c(ql5Var.b, p3u0Var), ql5Var.f, ((arn0) obj2).c.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)));
                    wqn0Var.j = 1;
                    if (((kmq) obj4).a(ksn0Var, wqn0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof ryn0) {
                    ryn0Var = (ryn0) yjeVar;
                    int i5 = ryn0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ryn0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ryn0Var = new ryn0(this, yjeVar);
                    }
                } else {
                    ryn0Var = new ryn0(this, yjeVar);
                }
                Object obj7 = ryn0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = ryn0Var.j;
                if (i6 == 0) {
                    z1x.P(obj7);
                    ql5 ql5Var2 = (ql5) obj;
                    pn40 pn40Var2 = pn40.f27267a;
                    double d2 = ((jsn0) obj3).f17062a;
                    p3u0 p3u0Var2 = p3u0.c;
                    ksn0 ksn0Var2 = new ksn0(pn40.c(d2, p3u0Var2), pn40.c(ql5Var2.b, p3u0Var2), ql5Var2.f, ((zyn0) obj2).K.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)));
                    ryn0Var.j = 1;
                    if (((kmq) obj4).a(ksn0Var2, ryn0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            default:
                Object objD0 = ntb.d0((CoroutineContext) obj4, obj, obj3, (n7t0) obj2, yjeVar);
                return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
        }
    }

    public /* synthetic */ cdm0(kmq kmqVar, Object obj, Object obj2, byte b) {
        this.f4168a = b;
        this.b = kmqVar;
        this.c = obj;
        this.d = obj2;
    }
}
