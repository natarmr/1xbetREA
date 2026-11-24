package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jf20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qg20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf20(qg20 qg20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qg20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qg20 qg20Var = this.k;
        switch (b) {
            case 0:
                jf20 jf20Var = new jf20(qg20Var, yjeVar, (byte) 0);
                jf20Var.j = obj;
                return jf20Var;
            case 1:
                jf20 jf20Var2 = new jf20(qg20Var, yjeVar, (byte) 1);
                jf20Var2.j = obj;
                return jf20Var2;
            case 2:
                jf20 jf20Var3 = new jf20(qg20Var, yjeVar, (byte) 2);
                jf20Var3.j = obj;
                return jf20Var3;
            default:
                jf20 jf20Var4 = new jf20(qg20Var, yjeVar, (byte) 3);
                jf20Var4.j = obj;
                return jf20Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jf20) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jf20) create((ytb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.i;
        yje yjeVar = null;
        byte b2 = 2;
        qg20 qg20Var = this.k;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                qg20Var.t.b(th, new ed20(qg20Var, (byte) 4));
                break;
            case 1:
                List list = (List) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qg20 qg20Var2 = this.k;
                pru pruVar = qg20Var2.v;
                mne mneVar = qg20Var2.d;
                boolean z2 = pruVar.a().f32117a.f12063a.h;
                q4f q4fVarA = qg20Var2.i.a();
                byte b3 = 1;
                byte b4 = 0;
                boolean z3 = q4fVarA == q4f.c || q4fVarA == q4f.d || q4fVarA == q4f.m;
                if (q4fVarA != q4f.m) {
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i = ((m97) it.next()).b;
                                tqt tqtVar = uoy.b;
                                if (i != 3) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    if (list == null || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int i2 = ((m97) it2.next()).b;
                                tqt tqtVar2 = uoy.b;
                                if (i2 == 3) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                }
                p7m0 p7m0Var = qg20Var2.m1;
                Boolean boolValueOf = Boolean.valueOf(qg20Var2.E.k() && z && z2 && z3);
                p7m0Var.getClass();
                p7m0Var.o(null, boolValueOf);
                sac.V(jiu0.a(qg20Var2), new cd20(qg20Var2, (byte) 5), null, mneVar.b, new a9u(qg20Var2, null), 10);
                c4m0 c4m0Var = qg20Var2.Q0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                Class<qg20> cls = qg20.class;
                qg20Var2.Q0 = sac.T(new fnq(new fnq(((lye) ((oif0) qg20Var2.I.f27640a).b).m, new uf20(qg20Var2, q4fVarA, yjeVar, b4)), new uf20(qg20Var2, q4fVarA, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(qg20Var2), mneVar.b), new dm10(2, qg20Var2, cls, "handleBetBlockChangeError", "handleBetBlockChangeError(Ljava/lang/Throwable;)V", 4, (byte) 29));
                c4m0 c4m0Var2 = qg20Var2.R0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                qg20Var2.R0 = sac.T(new fnq(((lye) qg20Var2.J.f42910a.b).l, new uf20(qg20Var2, q4fVarA, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(qg20Var2), mneVar.b), new vf20(2, qg20Var2, cls, "handleBetBlockChangeError", "handleBetBlockChangeError(Ljava/lang/Throwable;)V", 4, (byte) 0));
                break;
            case 2:
                ytb0 ytb0Var = (ytb0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qg20 qg20Var3 = this.k;
                sac.V(jiu0.a(qg20Var3), new yw10(1, qg20Var3, qg20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), new dd20(qg20Var3, b2), qg20Var3.d.b, new hf20(qg20Var3, ytb0Var, null), 8);
                break;
            default:
                Throwable th2 = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                qg20Var.c0();
                break;
        }
        return Unit.f46060a;
    }
}
