package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class a48 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a48(diu0 diu0Var, int i, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = diu0Var;
        this.k = i;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new a48((d48) obj2, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new a48((n880) obj2, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new a48((aa80) obj2, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new a48((eze0) obj2, this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new a48((x5f0) obj2, this.k, this.l, yjeVar, (byte) 4);
            case 5:
                return new a48((ocf0) obj2, this.k, this.l, yjeVar, (byte) 5);
            default:
                a48 a48Var = new a48((nok0) obj2, this.l, yjeVar);
                a48Var.k = ((Number) obj).intValue();
                return a48Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((a48) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a48) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws g2 {
        Object objH;
        Object value;
        Object objH2;
        Object objH3;
        Object value2;
        d980 d980Var;
        Object objH4;
        Object objH5;
        Object objH6;
        byte b = this.i;
        byte b2 = 3;
        boolean z = this.l;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                d48 d48Var = (d48) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    rpt rptVar = d48Var.f;
                    int i = this.k;
                    this.j = true;
                    objH = rptVar.h(i, this);
                    if (objH == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                qkt qktVar = (qkt) objH;
                int i2 = qktVar.f28902a;
                d48Var.E = i2;
                d48Var.b.e("SAVED_SELECTED_COUNTY_CODE", new Integer(i2));
                d48Var.F = aac.c0(qktVar, z, d48Var.g.a());
                d48Var.C.f(m38.f21101a);
                p7m0 p7m0Var = d48Var.B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, v38.a((v38) value, null, "", false, false, null, 253)));
                d48Var.C(d48Var.F);
                return Unit.f46060a;
            case 1:
                n880 n880Var = (n880) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rpt rptVar2 = n880Var.y;
                    int i3 = this.k;
                    this.j = true;
                    objH2 = rptVar2.h(i3, this);
                    if (objH2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH2 = obj;
                }
                int i4 = n880.L;
                n880Var.H(new rb4((qkt) objH2, z, b2));
                return Unit.f46060a;
            case 2:
                aa80 aa80Var = (aa80) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    rpt rptVar3 = aa80Var.l;
                    int i5 = this.k;
                    this.j = true;
                    objH3 = rptVar3.h(i5, this);
                    if (objH3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH3 = obj;
                }
                qkt qktVar2 = (qkt) objH3;
                p7m0 p7m0Var2 = aa80Var.z;
                do {
                    value2 = p7m0Var2.getValue();
                    d980Var = (d980) value2;
                } while (!p7m0Var2.m(value2, d980.a(d980Var, false, null, c980.a(d980Var.c, "", null, 5), mbc.e0(qktVar2, z), null, false, false, 115)));
                return Unit.f46060a;
            case 3:
                eze0 eze0Var = (eze0) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    rpt rptVar4 = eze0Var.U;
                    int i6 = this.k;
                    this.j = true;
                    objH4 = rptVar4.h(i6, this);
                    if (objH4 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH4 = obj;
                }
                kq90 kq90VarC0 = xia0.c0((qkt) objH4, z);
                int i7 = eze0.y0;
                eze0Var.S(kq90VarC0);
                eze0Var.x0.m(u0f0.h, "");
                return Unit.f46060a;
            case 4:
                x5f0 x5f0Var = (x5f0) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    rpt rptVar5 = x5f0Var.T;
                    int i8 = this.k;
                    this.j = true;
                    objH5 = rptVar5.h(i8, this);
                    if (objH5 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH5 = obj;
                }
                kq90 kq90VarC1 = xia0.c0((qkt) objH5, z);
                int i9 = x5f0.z0;
                x5f0Var.R(kq90VarC1);
                x5f0Var.y0.x(u0f0.h, "");
                return Unit.f46060a;
            case 5:
                ocf0 ocf0Var = (ocf0) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    rpt rptVar6 = ocf0Var.T;
                    int i10 = this.k;
                    this.j = true;
                    objH6 = rptVar6.h(i10, this);
                    if (objH6 == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH6 = obj;
                }
                kq90 kq90VarC2 = xia0.c0((qkt) objH6, z);
                int i11 = ocf0.z0;
                ocf0Var.S(kq90VarC2);
                ocf0Var.y0.C(u0f0.h, "");
                return Unit.f46060a;
            default:
                int i12 = this.k;
                Object obj3 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    nok0 nok0Var = (nok0) obj2;
                    uli0 uli0Var = new uli0(i12, b2);
                    this.k = i12;
                    this.j = true;
                    Object objD0 = qjj.d0(nok0Var.c.b, new eyc0(nok0Var, z, uli0Var, (yje) null), this);
                    if (objD0 != obj3) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a48(nok0 nok0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.m = nok0Var;
        this.l = z;
    }
}
