package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rnn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wnn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rnn(wnn wnnVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = wnnVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        wnn wnnVar = this.k;
        switch (b) {
            case 0:
                return new rnn(wnnVar, yjeVar, (byte) 0);
            case 1:
                return new rnn(wnnVar, yjeVar, (byte) 1);
            case 2:
                return new rnn(wnnVar, yjeVar, (byte) 2);
            case 3:
                return new rnn(wnnVar, yjeVar, (byte) 3);
            case 4:
                return new rnn(wnnVar, yjeVar, (byte) 4);
            case 5:
                return new rnn(wnnVar, yjeVar, (byte) 5);
            default:
                return new rnn(wnnVar, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((rnn) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object value;
        Object objK2;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        byte b2 = 3;
        wnn wnnVar = this.k;
        byte b3 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ocl oclVar = wnnVar.E;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ag3 ag3Var = wnnVar.x;
                    String str = ((vqc) oclVar.f25032a).d().f36579a;
                    ag3Var.getClass();
                    str.getClass();
                    i8i.D("coupon_id", str, ag3Var.f809a, "coupon_edit_delete_event");
                    ik4 ik4Var = wnnVar.y;
                    String str2 = ((vqc) oclVar.f25032a).d().f36579a;
                    ik4Var.getClass();
                    str2.getClass();
                    b1j.v(str2, ik4Var.f14907a, 3219L);
                    p4a p4aVar = wnnVar.I;
                    long j = ((inn) wnnVar.D()).m;
                    vqc vqcVar = p4aVar.b;
                    es esVar = p4aVar.f26343a;
                    esVar.A(j);
                    if (esVar.i().isEmpty()) {
                        vqcVar.m(q4f.b);
                    } else if (esVar.i().size() == 1) {
                        vqcVar.m(q4f.c);
                    } else {
                        q4f q4fVarE = vqcVar.e();
                        int size = esVar.i().size();
                        q4f.f28094a.getClass();
                        if (size < nwd.d(q4fVarE)) {
                            vqcVar.m(q4f.d);
                        }
                    }
                    gmq gmqVarB = wnnVar.r.b();
                    this.j = true;
                    objK = ntb.K(gmqVarB, this);
                    if (objK == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                if (!((Boolean) objK).booleanValue()) {
                    int i = wnn.g0;
                    wnnVar.S();
                    return Unit.f46060a;
                }
                int i2 = wnn.g0;
                wnnVar.R();
                p7m0 p7m0Var = wnnVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, inn.a((inn) value, null, false, null, null, null, null, false, false, null, 0L, false, 28671)));
                return Unit.f46060a;
            case 1:
                pq pqVar = wnnVar.s;
                m1e m1eVar = wnnVar.r;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    wnnVar.J.n(false);
                    gmq gmqVarB2 = m1eVar.b();
                    this.j = true;
                    objK2 = ntb.K(gmqVarB2, this);
                    if (objK2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                if (!((Boolean) objK2).booleanValue()) {
                    int i3 = wnn.g0;
                    wnnVar.S();
                } else if (!(((inn) wnnVar.D()).g instanceof yln) && !(((inn) wnnVar.D()).g instanceof zln) && !pqVar.f27394a.i().isEmpty() && !wnnVar.O()) {
                    wnnVar.T();
                }
                int i4 = wnn.g0;
                c4m0 c4m0Var = wnnVar.a0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                wnnVar.a0 = i3t0.L(wnnVar, new fnq(m1eVar.b(), new tnn(wnnVar, yjeVar, b3), (byte) 4), null, null, 3);
                if (((inn) wnnVar.D()).g.equals(wln.f39362a) && !wnnVar.O() && !pqVar.f27394a.i().isEmpty()) {
                    wnnVar.R();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i5 = wnn.g0;
                    bby bbyVar = wnnVar.c0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    wnnVar.c0 = i3t0.K(wnnVar, null, null, new rnn(wnnVar, yjeVar, b2), 3);
                    rrd rrdVar = wnnVar.t;
                    long j2 = wnnVar.o;
                    this.j = true;
                    if (rrdVar.x(j2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i6 = wnn.g0;
                wnnVar.R();
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i7 = wnn.g0;
                p7m0 p7m0Var2 = wnnVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, inn.a((inn) value2, null, false, null, zln.f44588a, null, null, false, false, null, 0L, false, 32703)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i8 = wnn.g0;
                p7m0 p7m0Var3 = wnnVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, inn.a((inn) value3, null, false, null, null, null, null, false, false, null, 0L, true, 24575)));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i9 = wnn.g0;
                p7m0 p7m0Var4 = wnnVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, inn.a((inn) value4, null, false, null, null, null, knn.f18594a, false, false, null, 0L, false, 32511)));
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    int i10 = wnn.g0;
                    bby bbyVar2 = wnnVar.Z;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    wnnVar.Z = i3t0.K(wnnVar, null, null, new rnn(wnnVar, yjeVar, (byte) 5), 3);
                    sd60 sd60Var = wnnVar.Q;
                    long j3 = wnnVar.o;
                    this.j = true;
                    if (sd60Var.g(j3, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i11 = wnn.g0;
                bby bbyVar3 = wnnVar.Z;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                hxu hxuVar = (hxu) ((jnn) wnnVar.T.f6506a.b).b.getValue();
                if (hxuVar == null) {
                    hxuVar = hxu.h;
                }
                wnnVar.H(new d0n(wnnVar, hxuVar, (byte) 24));
                return Unit.f46060a;
        }
    }
}
