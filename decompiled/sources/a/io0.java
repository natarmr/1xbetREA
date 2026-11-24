package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class io0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qo0 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io0(qo0 qo0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = qo0Var;
        this.m = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.m;
        qo0 qo0Var = this.l;
        switch (b) {
            case 0:
                io0 io0Var = new io0(qo0Var, z, yjeVar, (byte) 0);
                io0Var.k = obj;
                return io0Var;
            case 1:
                io0 io0Var2 = new io0(qo0Var, z, yjeVar, (byte) 1);
                io0Var2.k = obj;
                return io0Var2;
            default:
                io0 io0Var3 = new io0(qo0Var, z, yjeVar, (byte) 2);
                io0Var3.k = obj;
                return io0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((io0) create((cm80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((io0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((io0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objW;
        byte b = this.i;
        sn0 sn0Var = sn0.f32471a;
        switch (b) {
            case 0:
                cm80 cm80Var = (cm80) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i = qo0.V;
                    if (cm80Var != null) {
                        boolean z2 = cm80Var instanceof tl80;
                        qo0 qo0Var = this.l;
                        if (z2) {
                            qo0Var.X(yk0.VIEWED, qn0.f29010a);
                        } else {
                            boolean z3 = cm80Var instanceof zl80;
                            boolean z4 = this.m;
                            if (z3) {
                                zl80 zl80Var = (zl80) cm80Var;
                                if (zl80Var.b) {
                                    qo0Var.X(yk0.VIEWED, sn0Var);
                                } else {
                                    objW = qo0Var.W(zl80Var.f44568a, true, yk0.VIEWED, z4, this);
                                    if (objW != wneVar) {
                                        objW = Unit.f46060a;
                                    }
                                }
                            } else if (cm80Var instanceof wl80) {
                                objW = qo0Var.W(((wl80) cm80Var).f39341a, true, yk0.VIEWED, z4, this);
                                if (objW != wneVar) {
                                    objW = Unit.f46060a;
                                }
                            }
                            if (objW == wneVar) {
                                return wneVar;
                            }
                        }
                        objW = Unit.f46060a;
                        if (objW == wneVar) {
                            return wneVar;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 1:
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bo0 bo0Var = new bo0(list, (byte) 1);
                    int i2 = qo0.V;
                    qo0 qo0Var2 = this.l;
                    qo0Var2.H(bo0Var);
                    yk0 yk0Var = yk0.FAVORITES;
                    if ((qo0Var2.S(yk0Var) instanceof rn0) != (!list.isEmpty())) {
                        qo0Var2.X(yk0Var, sn0Var);
                    }
                    this.k = null;
                    this.j = true;
                    if (qo0Var2.W(list, true, yk0Var, this.m, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                List list2 = (List) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    yk0 yk0Var2 = yk0.VIEWED;
                    int i3 = qo0.V;
                    qo0 qo0Var3 = this.l;
                    if ((qo0Var3.S(yk0Var2) instanceof rn0) != (!list2.isEmpty())) {
                        qo0Var3.X(yk0Var2, sn0Var);
                    }
                    this.k = null;
                    this.j = true;
                    if (qo0Var3.W(list2, true, yk0Var2, this.m, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
