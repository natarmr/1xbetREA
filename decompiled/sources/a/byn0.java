package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class byn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zyn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byn0(zyn0 zyn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zyn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zyn0 zyn0Var = this.k;
        switch (b) {
            case 0:
                return new byn0(zyn0Var, yjeVar, (byte) 0);
            case 1:
                return new byn0(zyn0Var, yjeVar, (byte) 1);
            case 2:
                return new byn0(zyn0Var, yjeVar, (byte) 2);
            case 3:
                return new byn0(zyn0Var, yjeVar, (byte) 3);
            case 4:
                return new byn0(zyn0Var, yjeVar, (byte) 4);
            case 5:
                return new byn0(zyn0Var, yjeVar, (byte) 5);
            case 6:
                byn0 byn0Var = new byn0(zyn0Var, yjeVar, (byte) 6);
                byn0Var.j = ((Boolean) obj).booleanValue();
                return byn0Var;
            default:
                return new byn0(zyn0Var, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((byn0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((byn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((byn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((byn0) create((jsn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((byn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((byn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((byn0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((byn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objD;
        Object objB;
        Object value2;
        Object objB2;
        Object value3;
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 3;
        byte b4 = 4;
        zyn0 zyn0Var = this.k;
        byte b5 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                mne mneVar = zyn0Var.C;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                byte b6 = 5;
                if (!z) {
                    z1x.P(obj);
                    int i = zyn0.u0;
                    slb.U(new fnq(new dnq(zyn0Var.a0.b(), new pyn0(b3, yjeVar, b5), (byte) 1), new byn0(zyn0Var, yjeVar, (byte) 6), (byte) 4), d5c.S(jiu0.a(zyn0Var), mneVar.b));
                    sac.V(jiu0.a(zyn0Var), fyn0.f10367a, null, mneVar.f22085a, new gyn0(zyn0Var, yjeVar, b2), 10);
                    sac.V(jiu0.a(zyn0Var), tyn0.f34764a, null, mneVar.f22085a, new byn0(zyn0Var, yjeVar, b6), 10);
                    sac.V(jiu0.a(zyn0Var), uyn0.f36499a, null, null, new byn0(zyn0Var, yjeVar, (byte) 7), 14);
                    p7m0 p7m0Var = zyn0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, true, false, false, false, null, null, null, null, null, false, false, false, null, 130831)));
                    zyn0Var.Q();
                    v3c.N(zyn0Var.t0);
                    zyn0Var.t0 = sac.V(jiu0.a(zyn0Var), oyn0.f26065a, null, mneVar.f22085a, new byn0(zyn0Var, yjeVar, b4), 10);
                    fuj0 fuj0Var = zyn0Var.g0;
                    this.j = true;
                    objD = fuj0Var.D(this);
                    if (objD == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                if (((Number) objD).intValue() <= 5) {
                    int i2 = zyn0.u0;
                    zyn0Var.P(true);
                }
                int i3 = zyn0.u0;
                zyn0Var.V();
                if (((vxn0) zyn0Var.D()).f) {
                    v3c.N(zyn0Var.p0);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fuj0 fuj0Var2 = zyn0Var.g0;
                    this.j = true;
                    objB = fuj0Var2.B(this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                if (((Boolean) objB).booleanValue() && !((vxn0) zyn0Var.D()).h) {
                    zyn0Var.T();
                    p7m0 p7m0Var2 = zyn0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, vxn0.a((vxn0) value2, null, null, false, false, false, false, true, true, null, null, null, null, null, false, false, true, null, 98059)));
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    fuj0 fuj0Var3 = zyn0Var.g0;
                    this.j = true;
                    objB2 = fuj0Var3.B(this);
                    if (objB2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objB2).booleanValue();
                int i4 = zyn0.u0;
                zyn0Var.G(exn0.f8587a);
                p7m0 p7m0Var3 = zyn0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, vxn0.a((vxn0) value3, null, null, false, false, !zBooleanValue, false, zBooleanValue, false, null, null, null, null, null, false, false, false, null, 130959)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    int i5 = zyn0.u0;
                    if (zyn0Var.X(false, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    utb utbVarC = aoq.c(new fnq(zyn0Var.h0, new byn0(zyn0Var, yjeVar, b3), (byte) 4), new za60(yjeVar, (Object) zyn0Var, (byte) 16));
                    lpn0 lpn0Var = new lpn0(zyn0Var, (byte) 10);
                    this.j = true;
                    if (utbVarC.c(lpn0Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0Var4 = ((yvn0) zyn0Var.L.f21833a.d).f;
                din0 din0Var = new din0(zyn0Var, yjeVar, b5);
                this.j = true;
                p7m0Var4.c(new vnq(h660.f12515a, din0Var, (byte) 2), this);
                return wneVar6;
            case 6:
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i6 = zyn0.u0;
                p7m0 p7m0Var5 = zyn0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var5.getValue();
                    value4.getClass();
                    boolean z8 = z7;
                    if (p7m0Var5.m(value4, vxn0.a((vxn0) value4, null, null, false, false, false, false, false, false, null, null, null, null, null, false, z8, false, null, 114687))) {
                        return Unit.f46060a;
                    }
                    z7 = z8;
                }
                break;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    uii uiiVar = zyn0Var.G;
                    ewt ewtVar = new ewt(((xxn0) ((dpi0) ((hnu) uiiVar.f35730a).f13365a).f6468a).f41667a, uiiVar, (byte) 13);
                    ssl0 ssl0Var = new ssl0((Object) zyn0Var, yjeVar, (byte) 11);
                    this.j = true;
                    if (slb.O(ewtVar, ssl0Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
