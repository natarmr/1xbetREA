package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class npp extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Serializable p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npp(yje yjeVar, Object obj, Serializable serializable, Object obj2, boolean z, boolean z2, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.o = obj;
        this.p = serializable;
        this.q = obj2;
        this.m = z;
        this.n = z2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.q;
        Serializable serializable = this.p;
        Object obj5 = this.o;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                npp nppVar = new npp(yjeVar, (pmi) obj5, (zos) serializable, (sgs) obj4, this.m, this.n, (byte) 0);
                nppVar.k = kmqVar;
                nppVar.l = obj2;
                return nppVar.invokeSuspend(Unit.f46060a);
            case 1:
                npp nppVar2 = new npp(yjeVar, (f1v) obj5, (lie0) serializable, (hie0) obj4, this.m, this.n, (byte) 1);
                nppVar2.k = kmqVar;
                nppVar2.l = obj2;
                return nppVar2.invokeSuspend(Unit.f46060a);
            default:
                npp nppVar3 = new npp(yjeVar, (v1v) obj5, (lie0) serializable, (hie0) obj4, this.m, this.n, (byte) 2);
                nppVar3.k = kmqVar;
                nppVar3.l = obj2;
                return nppVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List listS;
        List listS2;
        byte b = this.i;
        boolean z = this.n;
        boolean z2 = this.m;
        Object obj2 = this.o;
        Serializable serializable = this.p;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    long jLongValue = ((Number) this.l).longValue();
                    pmi pmiVar = (pmi) obj2;
                    ros rosVar = (ros) pmiVar.b;
                    zos zosVar = (zos) serializable;
                    sgs sgsVar = (sgs) obj3;
                    boolean zJ = ((j1q0) pmiVar.d).f15748a.j();
                    rosVar.getClass();
                    zosVar.getClass();
                    sgsVar.getClass();
                    lnf0 lnf0VarD = rosVar.c.d();
                    Long lValueOf = Long.valueOf(jLongValue);
                    if (jLongValue == -26) {
                        lValueOf = null;
                    }
                    jo20 jo20VarU = n7x.u(lnf0VarD, sgsVar, zosVar, lValueOf);
                    hie0 hie0Var = new hie0();
                    dnq dnqVar = new dnq(new gr0(gfx.R(rosVar.b.d, rosVar.a(zosVar), null, new los(rosVar, sgsVar, jLongValue, zosVar, jo20VarU, zJ, this.m, this.n, hie0Var, null), 252), hie0Var, jLongValue), new rj(zosVar, (yje) null, (byte) 29), (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, dnqVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                hie0 hie0Var2 = (hie0) obj3;
                lie0 lie0Var = (lie0) serializable;
                f1v f1vVar = (f1v) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    Object obj4 = ((j0g0) this.l).f15681a;
                    boolean z5 = obj4 instanceof g0g0;
                    if (z5) {
                        listS = f1vVar.f8785a.s(y9s.f42264a);
                    } else {
                        lie0Var.f20100a = System.currentTimeMillis();
                        hie0Var2.f13108a = true;
                        listS = (List) (z5 ? null : obj4);
                        if (listS == null) {
                            listS = iun.f15405a;
                        }
                    }
                    e1v e1vVar = new e1v(f1vVar.e.k(listS, z2, z), obj4, lie0Var, hie0Var2, (byte) 0);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, e1vVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                hie0 hie0Var3 = (hie0) obj3;
                lie0 lie0Var2 = (lie0) serializable;
                v1v v1vVar = (v1v) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kmq kmqVar3 = this.k;
                    Object obj5 = ((j0g0) this.l).f15681a;
                    boolean z7 = obj5 instanceof g0g0;
                    if (z7) {
                        listS2 = v1vVar.b.s(y9s.b);
                    } else {
                        lie0Var2.f20100a = System.currentTimeMillis();
                        hie0Var3.f13108a = true;
                        listS2 = (List) (z7 ? null : obj5);
                        if (listS2 == null) {
                            listS2 = iun.f15405a;
                        }
                    }
                    e1v e1vVar2 = new e1v(v1vVar.e.k(listS2, z2, z), obj5, lie0Var2, hie0Var3, (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar3, e1vVar2, this) == wneVar3) {
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
