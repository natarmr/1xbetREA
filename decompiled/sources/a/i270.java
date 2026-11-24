package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i270 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n270 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i270(n270 n270Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n270Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n270 n270Var = this.k;
        switch (b) {
            case 0:
                return new i270(n270Var, yjeVar, (byte) 0);
            case 1:
                i270 i270Var = new i270(n270Var, yjeVar, (byte) 1);
                i270Var.j = ((Boolean) obj).booleanValue();
                return i270Var;
            case 2:
                i270 i270Var2 = new i270(n270Var, yjeVar, (byte) 2);
                i270Var2.j = ((Boolean) obj).booleanValue();
                return i270Var2;
            case 3:
                return new i270(n270Var, yjeVar, (byte) 3);
            default:
                return new i270(n270Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i270) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i270) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((i270) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((i270) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i270) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01b6  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objM;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        c270 c270Var;
        k170 k170Var;
        Object value7;
        c270 c270Var2;
        k170 k170Var2;
        Object objM2;
        Object value8;
        byte b = this.i;
        yje yjeVar = null;
        n270 n270Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    int i = n270.Z;
                    objM = n270Var.M(this);
                    if (objM == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                n270Var.Q.a(n270Var.K, true, ((ql5) objM).f28916a);
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = n270Var.R;
                p7m0 p7m0Var2 = n270Var.S;
                oyg0 oyg0Var = n270Var.f;
                ocj ocjVar = n270Var.i;
                int i2 = n270.Z;
                n270Var.O();
                if (z3) {
                    c4m0 c4m0Var = n270Var.V;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        pat patVar = (pat) p7m0Var.getValue();
                        patVar.getClass();
                        if (patVar instanceof kat) {
                            pat patVar2 = (pat) p7m0Var2.getValue();
                            patVar2.getClass();
                            if (patVar2 instanceof kat) {
                                n270Var.G(b270.f1841a);
                            }
                        }
                        n270Var.V = slb.U(new dnq(new fnq(new fnq(new rf0(new fnq(new p6d(p7m0Var, p7m0Var2, m270.h, (byte) 1), new j270(n270Var, yjeVar, b2), (byte) 4), (byte) 9), new az60(n270Var, null), (byte) 4), new j270(n270Var, yjeVar, (byte) 2), (byte) 4), new qos((Object) n270Var, yjeVar, (byte) 24), (byte) 1), d5c.S(jiu0.a(n270Var), n270Var.O.b));
                    }
                } else {
                    boolean z4 = ((c270) n270Var.D()).d;
                    pat patVar3 = (pat) p7m0Var.getValue();
                    patVar3.getClass();
                    if (!(patVar3 instanceof oat)) {
                        pat patVar4 = (pat) p7m0Var2.getValue();
                        patVar4.getClass();
                        z = patVar4 instanceof oat;
                    }
                    if (z4 && z) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value5 = p7m0Var3.getValue();
                            value5.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value5, c270.a((c270) value5, null, null, null, false, false, m170.c, null, null, 223)));
                    } else if (!z4 && z) {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value3, c270.a((c270) value3, null, null, null, false, false, m170.b, null, null, 223)));
                    } else if (((c270) n270Var.D()).h.isEmpty()) {
                        p7m0 p7m0Var5 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var5.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var5.m(value2, c270.a((c270) value2, null, null, null, false, false, m170.b, null, null, 223)));
                    } else if (!((c270) n270Var.D()).h.isEmpty()) {
                        p7m0 p7m0Var6 = ocjVar.f25029a;
                        do {
                            value = p7m0Var6.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var6.m(value, c270.a((c270) value, null, null, null, false, false, m170.f20993a, null, null, 223)));
                    }
                    p7m0 p7m0Var7 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var7.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var7.m(value4, c270.a((c270) value4, null, null, null, false, false, null, null, null, 239)));
                }
                p7m0 p7m0Var8 = ocjVar.f25029a;
                while (true) {
                    Object value9 = p7m0Var8.getValue();
                    value9.getClass();
                    boolean z5 = z3;
                    if (p7m0Var8.m(value9, c270.a((c270) value9, null, null, null, z5, false, null, null, null, 247))) {
                        return Unit.f46060a;
                    }
                    z3 = z5;
                }
                break;
            case 2:
                boolean z6 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = n270.Z;
                p7m0 p7m0Var9 = n270Var.i.f25029a;
                do {
                    value6 = p7m0Var9.getValue();
                    value6.getClass();
                    c270Var = (c270) value6;
                    k170Var = c270Var.g;
                } while (!p7m0Var9.m(value6, c270.a(c270Var, null, null, null, false, false, null, new k170(z6, k170Var.b, k170Var.c), null, 191)));
                if (z6) {
                    n270Var.O();
                }
                return Unit.f46060a;
            case 3:
                ocj ocjVar2 = n270Var.i;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (((c270) n270Var.D()).g.f17507a) {
                        this.j = true;
                        objM2 = n270Var.M(this);
                        if (objM2 == wneVar4) {
                            return wneVar4;
                        }
                    } else {
                        p7m0 p7m0Var10 = ocjVar2.f25029a;
                        do {
                            value7 = p7m0Var10.getValue();
                            value7.getClass();
                            c270Var2 = (c270) value7;
                            k170Var2 = c270Var2.g;
                        } while (!p7m0Var10.m(value7, c270.a(c270Var2, null, null, null, false, false, null, new k170(false, k170Var2.b, k170Var2.c), null, 191)));
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objM2 = obj;
                ql5 ql5Var = (ql5) objM2;
                kg kgVarB = n270Var.y.b();
                p7m0 p7m0Var11 = ocjVar2.f25029a;
                do {
                    value8 = p7m0Var11.getValue();
                    value8.getClass();
                } while (!p7m0Var11.m(value8, c270.a((c270) value8, null, null, null, false, false, null, new k170(true, kgVarB, ql5Var), null, 191)));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ls lsVar = n270Var.x;
                    long jA = s470.LUCKY_WHEEL.a();
                    this.j = true;
                    if (lsVar.b(jA, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                n270Var.K.d(new f270(n270Var, (byte) 5));
                return Unit.f46060a;
        }
    }
}
