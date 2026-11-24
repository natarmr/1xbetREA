package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jd70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xd70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd70(xd70 xd70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xd70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xd70 xd70Var = this.k;
        switch (b) {
            case 0:
                return new jd70(xd70Var, yjeVar, (byte) 0);
            case 1:
                return new jd70(xd70Var, yjeVar, (byte) 1);
            case 2:
                return new jd70(xd70Var, yjeVar, (byte) 2);
            case 3:
                return new jd70(xd70Var, yjeVar, (byte) 3);
            case 4:
                return new jd70(xd70Var, yjeVar, (byte) 4);
            default:
                jd70 jd70Var = new jd70(xd70Var, yjeVar, (byte) 5);
                jd70Var.j = ((Boolean) obj).booleanValue();
                return jd70Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jd70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jd70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jd70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jd70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((jd70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jd70) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        xb70 xb70Var;
        Object objB;
        Object value2;
        xb70 xb70Var2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        byte b = this.i;
        xd70 xd70Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ocj ocjVar = xd70Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = xd70.B0;
                    xd70Var.j0(false);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        xb70Var = (xb70) value;
                    } while (!p7m0Var.m(value, xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var.o, false, false, false, 0.0d, false, false, false, 29), null, null, 114687)));
                    pgr pgrVar = new pgr(false, ((xb70) xd70Var.D()).n.e);
                    Object obj2 = xd70Var.j0.get();
                    obj2.getClass();
                    xd70Var.m0(pgrVar.a((vby) obj2));
                    ahu ahuVar = (ahu) xd70Var.H.get();
                    bm5 bm5Var = ((xb70) xd70Var.D()).q.b;
                    this.j = true;
                    objB = ahuVar.b(bm5Var, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                int i2 = xd70.B0;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    xb70Var2 = (xb70) value2;
                } while (!p7m0Var2.m(value2, xb70.a(xb70Var2, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, z870.a(xb70Var2.q, 0, null, false, false, ql5Var, false, 47), 65535)));
                xd70Var.l0();
                xd70Var.Y();
                ((v88) xd70Var.u.get()).a(xd70Var.q, true, ((xb70) xd70Var.D()).q.e.f28916a);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Object obj3 = xd70Var.B.get();
                    obj3.getClass();
                    this.j = true;
                    if (hse0.a((hse0) obj3, null, true, this, 5) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = xd70.B0;
                p7m0 p7m0Var3 = xd70Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, xb70.a((xb70) value3, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 129023)));
                xd70Var.G(new qb70(((xb70) xd70Var.D()).c));
                xd70Var.G(new rb70(((xb70) xd70Var.D()).c));
                xd70Var.t0();
                return Unit.f46060a;
            case 2:
                Object obj4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    c5v0 c5v0Var = ((xb70) xd70Var.D()).c;
                    if (c5v0Var != null) {
                        this.j = true;
                        Object objD0 = qjj.d0(c5v0Var.b.c, new wup0(c5v0Var, yjeVar, (byte) 18), this);
                        if (objD0 != obj4) {
                            objD0 = Unit.f46060a;
                        }
                        if (objD0 == obj4) {
                            return obj4;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(3, bfn.SECONDS);
                    this.j = true;
                    if (qcc.P(jV0, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = xd70.B0;
                xd70Var.t0();
                return Unit.f46060a;
            case 4:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ea70 ea70Var = xd70Var.k0;
                    ud70 ud70Var = new ud70(xd70Var, null, (byte) 0);
                    this.j = true;
                    if (ea70Var.b(ud70Var, this) == wneVar4) {
                        return wneVar4;
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
                boolean z6 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar2 = xd70Var.i;
                boolean z7 = !((xb70) xd70Var.D()).g && z6;
                boolean z8 = ((xb70) xd70Var.D()).g && !z6;
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, xb70.a((xb70) value4, null, null, null, false, false, false, z6, false, null, false, false, 0, false, null, null, null, null, 131007)));
                if (((xb70) xd70Var.D()).n.f && !z6 && !((xb70) xd70Var.D()).n.c) {
                    xd70Var.r0();
                } else if (((xb70) xd70Var.D()).n.f && z8 && ((xb70) xd70Var.D()).n.c) {
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value8 = p7m0Var5.getValue();
                        value8.getClass();
                    } while (!p7m0Var5.m(value8, xb70.a((xb70) value8, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 130559)));
                } else if (z7 && ((xb70) xd70Var.D()).m) {
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var6.getValue();
                        value7.getClass();
                    } while (!p7m0Var6.m(value7, xb70.a((xb70) value7, null, null, null, false, false, false, false, false, null, true, false, 0, false, null, null, null, null, 130559)));
                } else if (z7 && ((xb70) xd70Var.D()).n.f && ((xb70) xd70Var.D()).n.c) {
                    p7m0 p7m0Var7 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var7.getValue();
                        value6.getClass();
                    } while (!p7m0Var7.m(value6, xb70.a((xb70) value6, null, null, null, false, false, false, false, false, null, true, false, 0, false, null, null, null, null, 130559)));
                    if (((xb70) xd70Var.D()).n.b) {
                        xd70Var.k0();
                    }
                } else if (z7) {
                    if (((xb70) xd70Var.D()).n.b) {
                        xd70Var.k0();
                    } else {
                        p7m0 p7m0Var8 = ocjVar2.f25029a;
                        do {
                            value5 = p7m0Var8.getValue();
                            value5.getClass();
                        } while (!p7m0Var8.m(value5, xb70.a((xb70) value5, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, null, 129023)));
                        xd70Var.t0();
                    }
                }
                return Unit.f46060a;
        }
    }
}
